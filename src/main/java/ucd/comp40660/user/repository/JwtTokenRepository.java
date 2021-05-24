package ucd.comp40660.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucd.comp40660.user.model.JwtToken;

@Repository
public interface JwtTokenRepository extends JpaRepository<JwtToken, String>{
    JwtToken findByJwtToken(String jwtToken);
}
