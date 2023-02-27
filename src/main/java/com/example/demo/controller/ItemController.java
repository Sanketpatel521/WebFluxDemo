package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ItemDTO;
import com.example.demo.service.ItemService;

import reactor.core.publisher.Flux;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;

	@Value("${mongo_role}")
	private String mongoRole;

	@GetMapping(path = "/getitems")
	public Flux<ItemDTO> getItems(@AuthenticationPrincipal User user) {
		
		boolean hasMongoAccess = user.getAuthorities().stream().anyMatch(x -> x.getAuthority().equals(mongoRole));
		
		return itemService.getItems(hasMongoAccess);
		
	}
}