package com.example.shopee_24808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Shopee24808Application {

	private final ShopService shopService;

	public Shopee24808Application(ShopService shopService) {
		this.shopService = shopService;

		this.shopService.registerClient("1", 2000);
		this.shopService.registerClient("2", 3000);
		this.shopService.registerClient("3", 1500);

		this.shopService.registerCart("masło");
		this.shopService.registerCart("jogurt");
		this.shopService.registerCart("mleko");

		System.out.println(this.shopService.buyItem("1", "mleko", 100));
		System.out.println(this.shopService.buyItem("2", "jogurt", 200));
		System.out.println(this.shopService.buyItem("3", "masło", 4000));

		System.out.println(this.shopService.findCart("mleko"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Shopee24808Application.class, args);
	}

}
