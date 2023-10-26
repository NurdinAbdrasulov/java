package kg.kstu.teaching.repository;

import kg.kstu.teaching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
