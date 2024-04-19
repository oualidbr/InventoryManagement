package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.model.PurchaseOrder;

@Repository
public interface purchaseOrderRepo  extends BaseRepository<PurchaseOrder, Long>{

}
