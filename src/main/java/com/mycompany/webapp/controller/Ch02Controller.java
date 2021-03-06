package com.mycompany.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/ch02")
@Log4j2
public class Ch02Controller {
//	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	@RequestMapping("/content")
	public String content() {
		log.info("실행");
		return "ch02/content";
	}
	
//	@RequestMapping(value="/method", method=RequestMethod.GET)
	@GetMapping("/method")
	public String method1() {
		log.info("실행");
		return "ch02/content";
	}
	
//	@RequestMapping(value="/method", method=RequestMethod.POST)
	@PostMapping("/method")
	public String method2() {
		log.info("실행");
		return "ch02/content";
	}
	
//	@PutMapping(value="/method", method=RequestMethod.PUT)
	@PutMapping("/method")
	public String method3() {
		log.info("실행");
		return "ch02/content";
	}
	
//	@RequestMapping(value="/method", method=RequestMethod.DELETE)
	@DeleteMapping("/method")
	public String method4() {
		log.info("실행");
		return "ch02/content";
	}
}
