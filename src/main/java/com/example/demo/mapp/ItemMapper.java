package com.example.demo.mapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.ItemDto;
import com.example.demo.model.Item;

@Component
public class ItemMapper implements BaseMapper<ItemDto, Item> {

	@Autowired
	private SupplierMapper supplierMapper;

	@Autowired
	private BrandMapper brandMapper;

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public ItemDto mapToDto(Item item) {
		if (item == null) {
			return null;
		}

		ItemDto itemDto = new ItemDto();
		itemDto.setId(item.getId());
		itemDto.setName(item.getName());
		itemDto.setDescription(item.getDescription());
		itemDto.setItemInStock(item.getItemInStock());
		itemDto.setPrintedPrice(item.getPrintedPrice());
		itemDto.setPrice(item.getPrice());
		itemDto.setSellDiscount(item.getSellDiscount());
		itemDto.setBuyDiscount(item.getBuyDiscount());
		itemDto.setQuantuty(item.getQuantuty());
		itemDto.setQRCode(item.getQRCode());
		itemDto.setDefective(item.getDefective());
		itemDto.setExpiration(item.getExpiration());
		itemDto.setSupplierDto(supplierMapper.mapToDto(item.getSupplier()));
		itemDto.setBrandDto(brandMapper.mapToDto(item.getBrand()));
		itemDto.setCategoryDto(categoryMapper.mapToDto(item.getCategory()) );

		return itemDto;
	}

	@Override
	public Item mapToEntity(ItemDto itemDto) {
		if (itemDto == null) {
			return null;
		}

		Item item = new Item();
		item.setId(itemDto.getId());
		item.setName(itemDto.getName());
		item.setDescription(itemDto.getDescription());
		item.setItemInStock(itemDto.getItemInStock());
		item.setPrintedPrice(itemDto.getPrintedPrice());
		item.setPrice(itemDto.getPrice());
		item.setSellDiscount(itemDto.getSellDiscount());
		item.setBuyDiscount(itemDto.getBuyDiscount());
		item.setQuantuty(itemDto.getQuantuty());
		item.setQRCode(itemDto.getQRCode());
		item.setDefective(itemDto.getDefective());
		item.setExpiration(itemDto.getExpiration());
		item.setSupplier(supplierMapper.mapToEntity(itemDto.getSupplierDto()));
		item.setBrand(brandMapper.mapToEntity(itemDto.getBrandDto()));
		item.setCategory(categoryMapper.mapToEntity(itemDto.getCategoryDto()));

		return item;
	}

}
