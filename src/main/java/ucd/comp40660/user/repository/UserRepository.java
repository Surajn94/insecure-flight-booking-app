package ucd.comp40660.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucd.comp40660.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
