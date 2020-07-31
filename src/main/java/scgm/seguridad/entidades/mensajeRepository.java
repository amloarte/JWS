package scgm.seguridad.entidades;

import org.springframework.data.jpa.repository.JpaRepository;

public interface mensajeRepository extends JpaRepository<mensaje, Long> {
    //User findByUsername(String username);
}
