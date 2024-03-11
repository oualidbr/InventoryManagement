package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.model.Item;

@Repository
public interface ItemRepo extends BaseRepository<Item, Long> {

}
