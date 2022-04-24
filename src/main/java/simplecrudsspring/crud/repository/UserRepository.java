package simplecrudsspring.crud.repository;

import simplecrudsspring.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
