package me.kondee3.Bank.WebUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<WebUser, Long> {
    Optional<WebUser> findWebUserByEmail(String email);
}
