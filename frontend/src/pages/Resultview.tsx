import { Button, CircularProgress, Divider, Grid, Typography } from "@mui/material";
import React from "react";
import Headline from "../component/Headline";
import ProjectCard from "../component/ProjectCard";
import { useParams } from "react-router-dom";
import { fetchProjectQuery, filterDuplicates } from "../ProjectData";
import HashSelector from "../component/HashSelector";
import { Project } from "../data/Project";
import { useQuery } from "@apollo/client";
import BadSmellList from "../component/BadSmellList";

function Resultview() {

    let params = useParams();
    const { data, loading, error } = useQuery(fetchProjectQuery);
    if (error) {
        console.error(error);
    }
    console.log(params);
    if (loading) {
        return <CircularProgress />;
    }
    const project: Project | undefined = filterDuplicates(data.getProjects).find((project: Project) => {
        return project.projectName === params.name;
    });
    if (!project) {
        return <div>Project not found</div>;
    }
    return (
        <div>
            <Headline />
            <br />
            <ProjectCard {...project} />
            <br />
            {addHashIfPresent(params.hash)}
            <Divider />
            <br />
            <HashSelector {...project} />
            <br />
            <Divider />
            <BadSmellList {...projectWithSingleHash(project, params.hash)} />
            <Divider />
            <br />
            <Grid container spacing={2}>
                <Grid item> <Button variant="contained" href={"/mutation/refactor/" + project.projectName + "/" + params.hash}>Refactor</Button></Grid>
                <Grid item><Button variant="contained" href={generateProjectConfigLink(project)}>Config</Button></Grid>
            </Grid>
        </div>
    );
}
export default Resultview;

function projectWithSingleHash(project: Project, hash: string | undefined): Project {
    if (hash) {
        return {
            projectName: project.projectName,
            commitHashes: [hash],
            projectUrl: project.projectUrl
        }
    }
    return project;
}
function addHashIfPresent(hash: string | undefined) {
    if (hash) {
        return <Typography>Current selected hash: {hash}</Typography>;
    }
    return <Typography>No hash selected</Typography>;
}
function toBase64(str: string) {
    return btoa(str);
}
function generateProjectConfigLink(project: Project) {
    return "/mutation/projectconfig/" + toBase64(project.projectUrl);
}