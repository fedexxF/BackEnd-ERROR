package Login.BackEnd.repository;

import Login.BackEnd.model.Educacion;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository  extends JpaRepository<Educacion, Long> {
}
