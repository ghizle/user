package com.ghizlen.users.repos;

import com.ghizlen.users.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}