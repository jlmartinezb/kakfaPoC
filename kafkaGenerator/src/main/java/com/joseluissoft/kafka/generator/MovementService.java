package com.joseluissoft.kafka.generator;


import org.springframework.stereotype.Service;

import com.joseluissoft.kafka.generator.Movement;

@Service
public class MovementService {
	public String createMovement(Movement movimientos) {
		String responsesmovimientomessage = null;
		if (movimientos != null) {
			responsesmovimientomessage = "Movement Create";
			// Aqui debe ir el mensaje de Kafka
		} else responsesmovimientomessage = "Movement create Failure";
		return responsesmovimientomessage;
	}

}
