package io.github.ccscshq.example.application.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
  private Long id;
  private String name;
}
