package com.fordevs.jwt.auth.service.repository;

import java.util.Optional;

import com.fordevs.jwt.auth.service.models.ERole;
import com.fordevs.jwt.auth.service.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
