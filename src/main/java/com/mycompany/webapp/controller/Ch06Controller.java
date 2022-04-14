package com.mycompany.webapp.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/ch06")
@Log4j2
public class Ch06Controller {
	@RequestMapping("/content")
	public String content() {
		return "ch06/content";
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "ch06/forward";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/";
	}
	
	@GetMapping("/getFragmentHtml")
	public String getFragmentHtml() {
		return "ch06/fragmentHtml";
	}
	
	@GetMapping("/getJson1")
	public void getJson1(HttpServletResponse response) throws Exception {
		//{"fileName" : "photo6.jpg"}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileName", "photo6.jpg");
		String json = jsonObject.toString();
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
//		pw.write(json);
		pw.println(json);
		pw.flush();
		pw.close();
	}
	
	@GetMapping(value="/getJson2", produces="application/json; charset=UTF-8")
	@ResponseBody //리턴되는 내용이 응답 본문에 들어간다.
	public String getJson2(HttpServletResponse response) throws Exception {
		//{"fileName" : "photo6.jpg"}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileName", "photo6.jpg");
		String json = jsonObject.toString();
		return json;
	}
	
	@GetMapping("/getJson3")
	public String getJson3() {
		return "redirect:/";
	}
}
