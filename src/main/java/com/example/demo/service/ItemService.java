package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.base.BaseService;
import com.example.demo.dto.ItemDto;
import com.example.demo.mapp.ItemMapper;
import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepo;

@Service
public class ItemService extends BaseService<Item, Long, ItemRepo, ItemDto, ItemMapper> {

}
