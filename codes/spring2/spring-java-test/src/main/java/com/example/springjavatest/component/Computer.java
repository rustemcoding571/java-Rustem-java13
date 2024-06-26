package com.example.springjavatest.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Computer {

	private Integer id;
	private String brand;
	private Integer price;
	private String model;
	@Autowired
	@Qualifier("compRam")
	private Ram ram;
	
	public Computer() {
		this.id = 444;
		this.brand = "Samsung";
		this.price = 2000;
		this.model = "pavilion";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	@PostConstruct
	public void destroy() {
		System.out.println("bu metod bean yəni bu obyektin consturctoru çağırıldıqdan sonra işə düşür");
	}
	
	@PreDestroy
	public void init() {
		System.out.println("bir bean'in sona ermeden önce (yıkılmadan önce) çalıştırılacak olan bir metodu işaretlemek için kullanılır.");
	}
	
	
	
	
	
}
