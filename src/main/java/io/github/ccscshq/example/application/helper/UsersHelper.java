package io.github.ccscshq.example.application.helper;

import org.mapstruct.Mapper;

import io.github.ccscshq.example.application.model.User;
import io.github.ccscshq.example.domain.entity.Users;

@Mapper(componentModel = "spring")
public interface UsersHelper {

  default User toUser(Users source) {
    return User.builder()
        .id(source.getId())
        .name(source.getName())
        .build();
  }
}
