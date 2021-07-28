package com.uday.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test")
	public String test(String name) {
		LOG.info("Test controller /test - tomcat");
		return "tomcat welcome = " + name; 
	}

	@GetMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		LOG.info("Test controller /greeting - tomcat");
		ModelAndView modelAndView = new ModelAndView("greeting");
		model.addAttribute("name", name);
		return modelAndView;
	}

}
