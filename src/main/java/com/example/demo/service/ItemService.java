package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ItemDTO;
import com.example.demo.entity.MongoItem;
import com.example.demo.entity.SqlItem;
import com.example.demo.repositry.MongoItemRepository;
import com.example.demo.repositry.SqlItemRepository;

import reactor.core.publisher.Flux;

@Service
public class ItemService {

	@Autowired
	SqlItemRepository sRepository;

	@Autowired
	MongoItemRepository mRepository;

	public Flux<ItemDTO> getItems(boolean hashasMongoAccess) {
		return hashasMongoAccess ? mRepository.findAll().map(MongoItem::entityToDto)
				: sRepository.findAll().map(SqlItem::entityToDto);
	}

}
