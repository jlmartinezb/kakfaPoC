package com.joseluissoft.kafka.generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseluissoft.kafka.generator.Movement;
import com.joseluissoft.kafka.generator.MovementService;

@RestController
@RequestMapping("/myapp/v1")
public class MovementController {

	@Autowired
	private MovementService movementService;
	@PostMapping
	@RequestMapping("/movememt")
	public ResponseEntity<String> createMovement(@RequestBody Movement request) {
		String response = movementService.createMovement(request);
		return ResponseEntity.ok(response);
	}
}
