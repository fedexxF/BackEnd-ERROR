package Login.BackEnd.repository;

import Login.BackEnd.model.Habilidades;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository  extends JpaRepository<Habilidades, Long> {
}
