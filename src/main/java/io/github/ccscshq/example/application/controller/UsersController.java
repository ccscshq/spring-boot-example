package io.github.ccscshq.example.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ccscshq.example.application.helper.UsersHelper;
import io.github.ccscshq.example.application.model.User;
import io.github.ccscshq.example.domain.service.UsersService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UsersController {

  private final UsersHelper usersHelper;
  private final UsersService usersService;

  @GetMapping("")
  public ResponseEntity<List<User>> findMany() {
    var users = usersService.findMany();
    var mapped = users.stream().map(usersHelper::toUser).toList();
    return ResponseEntity.ok(mapped);
  }
}
