package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.model.ItemOrder;

@Repository
public interface ItemOrderRepo extends BaseRepository<ItemOrder, Long> {

}
