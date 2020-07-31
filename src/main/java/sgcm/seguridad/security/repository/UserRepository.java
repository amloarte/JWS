package sgcm.seguridad.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sgcm.seguridad.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
