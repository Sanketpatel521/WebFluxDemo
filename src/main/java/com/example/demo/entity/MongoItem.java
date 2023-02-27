package com.example.demo.entity;

import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.dto.ItemDTO;

@Document("item")
public class MongoItem {
	
	@Id
	private String Id;
	private String name;
	private int quantity;
	private double price;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static ItemDTO entityToDto(MongoItem item) {
		ItemDTO itemDTO = new ItemDTO();
		BeanUtils.copyProperties(item, itemDTO);
		return itemDTO;

	}
}
