package com.azureClaroPayAgile.soap.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azureClaroPayAgile.soap.entity.Root;

@RestController
@RequestMapping("/rest")
public class AzureController {
	
	public ResponseEntity<String> testConexion()
		{
			return 	new ResponseEntity<>("OK", HttpStatus.OK);
		}
	
	@PostMapping("/test")
	public ResponseEntity<String> crear(@RequestBody Root entity)
		{
		String a = entity.eventType;
			//tring cadena = new String("{'respuesta':'ok'}");
			return ResponseEntity.status(HttpStatus.CREATED).body(a);
		}
}
