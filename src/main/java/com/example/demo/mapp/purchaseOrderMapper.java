package com.example.demo.mapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;
import com.example.demo.base.BaseMapper;
import com.example.demo.dto.ItemOrderDto;
import com.example.demo.dto.purchaseOrderDto;
import com.example.demo.model.ItemOrder;
import com.example.demo.model.PurchaseOrder;

@Component
public class purchaseOrderMapper implements BaseMapper<purchaseOrderDto, PurchaseOrder> {

	@Autowired
	private ItemOrderMapper itemOrderMapper;

	@Autowired
	private UserMapper userMapper;

	@Override
	public purchaseOrderDto mapToDto(PurchaseOrder PurchaseOrder) {
		if (PurchaseOrder == null) {
			return null;
		}

		purchaseOrderDto purchaseOrderDto = new purchaseOrderDto();
		purchaseOrderDto.setId(PurchaseOrder.getId());
		purchaseOrderDto.setTotalPrice(PurchaseOrder.getTotalPrice());
		purchaseOrderDto.setStatus(PurchaseOrder.getStatus());
		purchaseOrderDto.setOrderDate(PurchaseOrder.getOrderDate());
		Set<ItemOrderDto> itemOrderDtos = new HashSet<>();
		PurchaseOrder.getItemOrders().forEach(itemOrder -> itemOrderDtos.add(itemOrderMapper.mapToDto(itemOrder)));
		purchaseOrderDto.setItemOrderDtos(itemOrderDtos);
		purchaseOrderDto.setUserDto(userMapper.mapToDto(PurchaseOrder.getUser()));

		return purchaseOrderDto;
	}

	@Override
	public PurchaseOrder mapToEntity(purchaseOrderDto purchaseOrderDto) {
		if (purchaseOrderDto == null) {
			return null;
		}

		PurchaseOrder PurchaseOrder = new PurchaseOrder();
		PurchaseOrder.setId(purchaseOrderDto.getId());
		PurchaseOrder.setTotalPrice(purchaseOrderDto.getTotalPrice());
		PurchaseOrder.setStatus(purchaseOrderDto.getStatus());
		PurchaseOrder.setOrderDate(purchaseOrderDto.getOrderDate());
		Set<ItemOrder> itemOrders = new HashSet<>();
		purchaseOrderDto.getItemOrderDtos().forEach(itemOrderDto -> itemOrders.add(itemOrderMapper.mapToEntity(itemOrderDto)));
		PurchaseOrder.setItemOrders(itemOrders);
		PurchaseOrder.setUser(userMapper.mapToEntity(purchaseOrderDto.getUserDto()));

		return PurchaseOrder;
	}

}
