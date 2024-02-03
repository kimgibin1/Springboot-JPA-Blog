package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController // 특정 어노테이션이 붙어있는 클래스 파일들을 new 해서 스프링 컨테이너에서 관리해줌
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
		@GetMapping("/test/hello")
		public String hello() {
			return"<h1>hello spring boot</h1>";
		}
		
		@RequestMapping(value = "/")
		public ModelAndView testIndex() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index");
			
			return mv;
		}

}
