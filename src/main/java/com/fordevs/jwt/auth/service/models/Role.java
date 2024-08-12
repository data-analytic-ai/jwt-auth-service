package com.fordevs.jwt.auth.service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
@Data  // Lombok's annotation to generate getters, setters, equals, and hashcode methods
@NoArgsConstructor  // Lombok's annotation to generate no-args constructor
@AllArgsConstructor // Lombok's annotation to generate constructor with all class fields
public class Role {
  @Id
  private String id;
  private ERole name;

}