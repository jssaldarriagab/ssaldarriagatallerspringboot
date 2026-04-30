package com.saldarriaga.jssbusuarios.repository;

import com.saldarriaga.jssbusuarios.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

