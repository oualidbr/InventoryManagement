package com.example.demo.mapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.ItemOrderDto;
import com.example.demo.model.ItemOrder;

@Component
public class ItemOrderMapper implements BaseMapper<ItemOrderDto, ItemOrder> {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public ItemOrderDto mapToDto(ItemOrder itemOrder) {
		if (itemOrder == null) {
			return null;
		}

		ItemOrderDto itemOrderDto = new ItemOrderDto();
		itemOrderDto.setId(itemOrder.getId());
		itemOrderDto.setQuantity(itemOrder.getQuantity());
		itemOrderDto.setItem(itemMapper.mapToDto(itemOrder.getItem()));

		return itemOrderDto;
	}

	@Override
	public ItemOrder mapToEntity(ItemOrderDto itemOrderDto) {
		if (itemOrderDto == null) {
			return null;
		}
		ItemOrder itemOrder = new ItemOrder();
		itemOrder.setId(itemOrderDto.getId());
		itemOrder.setQuantity(itemOrderDto.getQuantity());
		itemOrder.setItem(itemMapper.mapToEntity(itemOrderDto.getItem()));

		return itemOrder;
	}

}
