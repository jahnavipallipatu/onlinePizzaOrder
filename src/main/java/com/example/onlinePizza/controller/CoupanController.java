package com.example.onlinePizza.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinePizza.entity.Coupan;
import com.example.onlinePizza.exceptions.CoupanIdNotFoundException;
import com.example.onlinePizza.exceptions.InvalidCoupanOperationException;
import com.example.onlinePizza.exceptions.PizzaIdNotFoundException;
import com.example.onlinePizza.service.ICoupanService;
@RestController
@RequestMapping("/coup")
    
    public class CoupanController {



       @Autowired
        private static ICoupanService iCoupanService;



       public CoupanController(ICoupanService iCoupanService) {
            
            this.iCoupanService = iCoupanService;
        }



       @RequestMapping("/add")
        @PostMapping
        public ResponseEntity<Coupan> addCoupan(@RequestBody Coupan coupan) {
            return new ResponseEntity<Coupan>(iCoupanService.addCoupans(coupan),HttpStatus.CREATED);
        }
        
        @RequestMapping("/view")
        @GetMapping
        public static List<Coupan> viewCoupans() {
            return iCoupanService.viewCoupans();
        }
        
        @RequestMapping("/edit")
        @PutMapping
        public ResponseEntity<Coupan> editCoupan(@RequestBody Coupan coupan) throws InvalidCoupanOperationException{
            return new ResponseEntity<Coupan>( iCoupanService.editCoupans(coupan),HttpStatus.OK);
            
        }
        
        @DeleteMapping("delete/{coupanId}")  
        private ResponseEntity<String> deleteCoupan(@PathVariable ("coupanId")long coupanId) throws CoupanIdNotFoundException{  
        	iCoupanService.deleteCoupans(coupanId);
    		return new ResponseEntity<String>(" deleted successfully", HttpStatus.OK);

        }
        

	
}
