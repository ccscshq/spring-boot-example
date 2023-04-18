package io.github.ccscshq.example.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.github.ccscshq.example.domain.entity.Users;

@Service
public class UsersService {

  public List<Users> findMany() {
    var user1 = Users.builder()
        .id(1L)
        .name("user1")
        .build();
    var user2 = Users.builder()
        .id(2L)
        .name("user2")
        .build();
    return Arrays.asList(user1, user2);
  }
}
