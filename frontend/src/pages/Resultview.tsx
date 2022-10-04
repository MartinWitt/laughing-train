import { Card, Divider } from "@mui/material";
import React, { useState } from "react";
import { useLoaderData } from "react-router-dom";
import Headline from "../component/Headline";
import ProjectCard from "../component/ProjectCard";
import { useParams } from "react-router-dom";
import { fetchBadSmellsforHashQuery, fetchProjectQuery, filterDuplicates } from "../ProjectData";
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
        return <div>Loading...</div>;
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
function showBadSmellsIfHashSelected(hash: string | undefined) {
        const { data, loading, error } = useQuery(fetchBadSmellsforHashQuery, {
            variables: {
                hash: hash
            }
        });
        return <h1>Bad Smells</h1>
}