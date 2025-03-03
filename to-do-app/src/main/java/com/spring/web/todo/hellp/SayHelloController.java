package com.spring.web.todo.hellp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello-jsp")
	public String sayHello() {
		return "sayHello";
	}
	
}
