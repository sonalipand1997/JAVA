package com.cybage.contoller;





import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cybage.model.*;
import com.cybage.service.BookService;


import java.util.List;



@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/addBook")
	public String showForm(Model model) {
		model.addAttribute("book",new Book());
		return "addBook";
	}
	@PostMapping("/addBook")
	public  ModelAndView addEmployee( @ModelAttribute("book") Book book,BindingResult result) {
		bookService.addBook(book);
		return new ModelAndView("displaybook","bookList",bookService.getbooks());
	}
	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id) {
		bookService.deletebook(id);
		return new ModelAndView("displaybook","bookList",bookService.getbooks());
	}
	@GetMapping("/getBookById")
	public String showFormId()
	{
		return "book";
	}
	
	
	
	/*
	 
	 
	@PostMapping("/getEmployee")
	public ModelAndView getEmployeeById(@RequestParam("empId") int id)
	{
		Employee employee=employeeService.getEmployeeById(id);
		return new  ModelAndView("employeeDetails","empInfo",employee);
	}
	@GetMapping("/editEmployee/{id}")
	public ModelAndView showUpdateForm(@PathVariable int id) {
		Employee employee= employeeService.getEmployeeById(id);
		return  new ModelAndView("updateEmployee","employee",employee);
	}
	
	@GetMapping("/test")
	public void TestAllMethod() {
		System.out.println(employeeService.getEmployeeByName("sara patil"));
		System.out.println(employeeService.getEmployeeByDesignation("engineer"));
		
		
		System.out.println(employeeService.getEmployeeByDesignation("engineering"));
		
		employeeService.getEmployees1().forEach(System.out::println);
	}
	
	
	*/
	
	
}
	
	