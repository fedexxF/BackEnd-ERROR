package Login.BackEnd.repository;

import Login.BackEnd.model.Proyectos;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository  extends JpaRepository<Proyectos, Long> {
}
