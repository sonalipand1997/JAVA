package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Book;
import com.cybage.service.BookService;

@Controller
public class BookController {

	
	

	//@RequestMapping(value="getAllEmployees",method=RequestMethod.GET)
	
	@Autowired     //framework create object
	BookService employeeService;
	
	@GetMapping("/getAllEmployees")
	public ModelAndView getAllEmployee()
	{
		List<Book>employeeList=BookService.getbook();
		return new ModelAndView("displayEmployee","empList","employeeList");
		
	}

}
