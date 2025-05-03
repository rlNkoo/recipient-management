package pl.rlnkoo.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkoo.authservice.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
}
