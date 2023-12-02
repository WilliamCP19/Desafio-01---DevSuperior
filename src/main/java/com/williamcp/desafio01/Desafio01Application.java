package com.williamcp.desafio01;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.williamcp.desafio01.Entities.Order;
import com.williamcp.desafio01.Services.OrderService;

@SpringBootApplication
public class Desafio01Application {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}
}
