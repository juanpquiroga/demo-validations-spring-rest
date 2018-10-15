package com.example.demo.errors;

import java.util.Date;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.ErrorDetails;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
      HttpHeaders headers, HttpStatus status, WebRequest request) {
	  
    ErrorDetails errorDetails = new ErrorDetails(new Date(), "Parametros invalidos",
    		((DefaultMessageSourceResolvable)ex.getBindingResult().getAllErrors().get(0).getArguments()[0]).getCode(),
    		ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
  }
  
  /*@ExceptionHandler(StudentNotFoundException)
  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(StudentNotFoundException ex, WebRequest request) {
    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
        request.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
  } */ 
}
