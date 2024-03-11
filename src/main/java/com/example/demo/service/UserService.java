package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.UserDto;
import com.example.demo.mapp.UserMapper;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService extends BaseService<User, Long, UserRepo, UserDto, UserMapper> {
 
}
