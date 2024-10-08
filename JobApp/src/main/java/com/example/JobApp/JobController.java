package com.example.JobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService service;
	@GetMapping({"/","home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("addjob")
	public String addjob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(@ModelAttribute("jobPost") JobPost jobPost, Model model) {
	    model.addAttribute("jobPost", jobPost);
	    service.addJob(jobPost);
	    return "success"; // Make sure you have a success.jsp page.
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model m) {
		List<JobPost> jobs=service.getAllJobs();
		m.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}



}
