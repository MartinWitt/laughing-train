import { CircularProgress, Divider } from "@mui/material";
import React from "react";
import Headline from "../component/Headline";
import ProjectCard from "../component/ProjectCard";
import { useParams } from "react-router-dom";
import {fetchProjectQuery, filterDuplicates } from "../ProjectData";
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
    const project : Project | undefined = filterDuplicates(data.getProjects).find((project: Project) => {
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
            </div>
        );
    }

export default Resultview;

function projectWithSingleHash(project: Project, hash: string | undefined) : Project {
    if (hash) {
        return {
            projectName: project.projectName,
            commitHashes: [hash],
            projectUrl: project.projectUrl
        }
    }
    return project;
}
function addHashIfPresent(hash: string | undefined) : string {
    if (hash) {
        return hash;
    }
    return "";
}