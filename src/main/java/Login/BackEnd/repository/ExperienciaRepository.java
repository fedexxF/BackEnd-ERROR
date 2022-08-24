package Login.BackEnd.repository;

import Login.BackEnd.model.Experiencia;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository  extends JpaRepository<Experiencia, Long> {
}
