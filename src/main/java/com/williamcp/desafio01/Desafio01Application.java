package com.williamcp.desafio01;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.williamcp.desafio01.Entities.Order;
import com.williamcp.desafio01.Services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final Scanner leitor = new Scanner(System.in);
		Order order = new Order();

		System.out.print("Código: ");
		order.setCode(Integer.parseInt(leitor.nextLine()));

		System.out.print("Preço: ");
		order.setBasic(Double.parseDouble(leitor.nextLine()));

		System.out.print("Desconto: ");
		order.setDiscount(Double.parseDouble(leitor.nextLine()));
		
		System.out.println("Pedido Código " + order.getCode());
		System.out.printf("Valor total: %.2f%n ", orderService.total(order));
	}
}
