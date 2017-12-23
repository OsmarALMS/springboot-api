package br.com.springboot.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.api.model.Greeting;

@RestController
public class GreetingController {

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public ResponseEntity<Greeting> getGreetingSimple(){
		return new ResponseEntity<Greeting>(new Greeting(0L, "Simple Greeting"), HttpStatus.OK);
	}
	
	@RequestMapping(value="/greeting/{id}/{content}", method = RequestMethod.GET)
	public ResponseEntity<Greeting> getGreeting(
			@PathVariable("id") Long id,
			@PathVariable("content") String content){
			
		return new ResponseEntity<Greeting>(new Greeting(id, content), HttpStatus.OK);
	}
	
	@RequestMapping(value="/greeting/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getGreeting(
			@PathVariable("id") Long id){
		return new ResponseEntity<>("Greeting não encontrada!", HttpStatus.FORBIDDEN);
	}
	
	@RequestMapping(value="/greeting", method = RequestMethod.POST)
	public ResponseEntity<?> postGreetingSimple(
			@RequestBody Greeting greeting){
		return new ResponseEntity<>(greeting.getId()+" - "+greeting.getContent(), HttpStatus.OK);
	}
}
