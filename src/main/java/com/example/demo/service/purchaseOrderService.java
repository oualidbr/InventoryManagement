package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.purchaseOrderDto;
import com.example.demo.mapp.purchaseOrderMapper;
import com.example.demo.model.PurchaseOrder;
import com.example.demo.repository.purchaseOrderRepo;

@Service
public class purchaseOrderService extends BaseService<PurchaseOrder, Long, purchaseOrderRepo, purchaseOrderDto, purchaseOrderMapper> {

}
