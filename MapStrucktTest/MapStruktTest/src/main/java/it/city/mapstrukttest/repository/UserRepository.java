package it.city.mapstrukttest.repository;

import it.city.mapstrukttest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
