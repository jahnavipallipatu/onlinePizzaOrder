package com.example.onlinePizza.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinePizza.entity.Customer;
import com.example.onlinePizza.entity.Pizza;
import com.example.onlinePizza.exceptions.CustomerIdNotFoundException;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;
import com.example.onlinePizza.service.IPizzaService;



@RequestMapping("/pizza")
@RestController

public class PizzaController {
	@Autowired
	private IPizzaService ipizzaService;

	
	public PizzaController(IPizzaService ipizzaService) {
		super();
		this.ipizzaService = ipizzaService;
	}

	
	//add 
	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<Pizza> addPizza(@RequestBody Pizza pizza){
		return new ResponseEntity<Pizza>(ipizzaService.addPizza(pizza),HttpStatus.CREATED);
		
	}
	
	
	//view
	@RequestMapping("/view")
	@GetMapping
	public List<Pizza> viewPizzaList(Pizza pizza) {
		return ipizzaService.viewPizzaList();
	}
	
	
	//update
	@PutMapping("/update")
	public ResponseEntity<Pizza> updatePizza(@RequestBody Pizza pizza){
		return new ResponseEntity<Pizza>(ipizzaService.updatePizza(pizza),HttpStatus.OK);
	}
	
	
	//delete
	
	@DeleteMapping("/delete/{pizzaId}")  
	private ResponseEntity<String> deletePizza(@PathVariable("pizzaId") long pizzaId)   throws PizzaIdNotFoundException
	{  
		ipizzaService.deletePizza(pizzaId);
		return new ResponseEntity<String>(" deleted successfully", HttpStatus.OK);

	}
	
    //view by id
	@GetMapping("/view/{id}") 
	public ResponseEntity<Pizza> findById(@PathVariable("id") long pizzaId)throws PizzaIdNotFoundException{
		
		return new ResponseEntity<Pizza>(ipizzaService.viewPizza(pizzaId),HttpStatus.OK);
	}
	
	 /*view by type		
		@RequestMapping("/type")
      public String viewPizzaList(Model model, @Param("pizzaType") String pizzaType) {
        List<Pizza> viewPizzaList = ipizzaService.viewPizzaList();
        model.addAttribute("listpizza", viewPizzaList);
        model.addAttribute("keyword", pizzaType);
         
        return "index";
    }
		@GetMapping("/viewbytype/{pizzaType}")
		public List<Pizza> viewPizzaList(@PathVariable String pizzaType){
			
			if(	@GetMapping("/viewbytype/{pizzaType}")
			public List<Pizza> viewPizzaList(@PathVariable String pizzaType){
				
				if(iPizzaRepository.viewPizzaList(pizzaType).isEmpty())
				{
					throw new BookNotFoundException("No pizzatype in the Data Base");
				}
				return iPizzaRepository.viewPizzaList(pizzaType);
			}.viewPizzaList(pizzaType).isEmpty())
			{
				throw new BookNotFoundException("No pizzatype in the Data Base");
			}
			return iPizzaRepository.viewPizzaList(pizzaType);
		}*/

}
