package com.example.onlinePizza.exceptions;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;





@ControllerAdvice
public class GlobalExceptionHandler {

	   @ExceptionHandler(value=PizzaIdNotFoundException.class)
	    public ResponseEntity<String> handlePizzaIdNotFoundException(Exception e){
	    ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	    return responseEntity;
	    }  
	   
	   @ExceptionHandler(value=InvalidCoupanOperationException.class)
	    public ResponseEntity<String> handleInvalidCoupanOperationException(Exception e){
	    ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	    return responseEntity;
	    }
	   
	   @ExceptionHandler(value=CoupanIdNotFoundException.class)
	    public ResponseEntity<String> handleCoupanIdNotFoundException(Exception e){
	    ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	    return responseEntity;
	    }
	   
	   @ExceptionHandler(value=CustomerIdNotFoundException.class)
	    public ResponseEntity<String> handleCustomerIdNotFoundException(Exception e){
	    ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	    return responseEntity;
	    }

		@ExceptionHandler(value=OrderIdNotFoundException.class)
		public ResponseEntity<String> handleOrderIdNotFoundException(Exception e){
		ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;
		}	
		
		
		@ExceptionHandler(value=InvalidSizeException.class)
		public ResponseEntity<String> handleInvalidSizeException(Exception e){
		ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;
		}	
		
		@ExceptionHandler(value=InvalidMinCostException.class)
		public ResponseEntity<String> InvalidMinCostException(Exception e){
		ResponseEntity<String> responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;
		}
		
		@ExceptionHandler(Exception.class)
		public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	   
}
