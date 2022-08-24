package Login.BackEnd.repository;

import Login.BackEnd.model.Footer;
import Login.BackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooterRepository  extends JpaRepository<Footer, Long> {
}
