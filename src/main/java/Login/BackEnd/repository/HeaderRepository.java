package Login.BackEnd.repository;

import Login.BackEnd.model.Header;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository  extends JpaRepository<Header, Long> {
}
