package com.spring.web.todo.real;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	private TodoService todoService;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("h");
		System.out.println(todos);
		if (todos == null || todos.isEmpty()) {
            model.addAttribute("todos", List.of()); // Ensure it's never null
        } else {
            model.addAttribute("todos", todos);
        }
		
		model.addAttribute("name", "User");
		return "listTodos";
	}
}
