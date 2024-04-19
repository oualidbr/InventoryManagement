package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.ItemOrderDto;
import com.example.demo.mapp.ItemOrderMapper;
import com.example.demo.model.ItemOrder;
import com.example.demo.repository.ItemOrderRepo;

@Service
public class ItemOrderService extends BaseService<ItemOrder, Long,ItemOrderRepo , ItemOrderDto, ItemOrderMapper> {

}
