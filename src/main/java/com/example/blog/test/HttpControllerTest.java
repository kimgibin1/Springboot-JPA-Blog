package com.example.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
		// 웹브라우저는 get요청만 가능함
		//http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return  "get요청"+m.getId()+","+m.getPassword()+","+m.getUsername();
	}
	
	//http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) {
		return  "post요청"+m.getId()+","+m.getPassword()+","+m.getUsername();
	}
	
	//http://localhost:8080/http/put (update)
	@PutExchange("/http/put")
	public String putTest() {
		return "put요청";
	}
	
	//http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
}
