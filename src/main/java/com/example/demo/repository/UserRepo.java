package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.base.BaseRepository;
import com.example.demo.model.User;

@Repository
public interface UserRepo extends BaseRepository<User, Long> {

}
