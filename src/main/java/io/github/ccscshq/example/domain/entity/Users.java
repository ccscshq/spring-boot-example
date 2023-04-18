package io.github.ccscshq.example.domain.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Users {
  private long id;
  private String name;
}
