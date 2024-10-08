package com.example.JobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.JobApp.model.JobPost;

@Repository
public class JobRepo {
    
    // List of job posts
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1, "Java Developer", "Must have good experience in core Java", 2, "Core Java"),
        new JobPost(2, "Python Developer", "Experience in Django required", 3, "Python, Django"),
        new JobPost(3, "Front-end Developer", "Knowledge of React.js and Angular", 4, "React.js, Angular")
    ));
    
    // Method to return all jobs
    public List<JobPost> getAllJobs() {
        return jobs; // Return the list of jobs
    }
    
    public void addJob(JobPost job) {
    	jobs.add(job);
    }
}
