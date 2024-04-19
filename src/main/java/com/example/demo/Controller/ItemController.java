package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseController;
import com.example.demo.dto.ItemDto;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController extends BaseController<ItemDto, Long, ItemService> {

}
