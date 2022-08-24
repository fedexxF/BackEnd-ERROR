package Login.BackEnd.service;

import Login.BackEnd.model.Educacion;
import Login.BackEnd.model.Footer;
import Login.BackEnd.repository.FooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FooterService {

    private final FooterRepository footerRepository;

    @Autowired
    public FooterService(FooterRepository footerRepository) {
        this.footerRepository = footerRepository;
    }


    public Footer addFooter(Footer footer) {
        return footerRepository.save(footer);
    }
    public List<Footer> findFooter(){
        return footerRepository.findAll();
    }
    public Footer EditFooter(Footer footer){
        return footerRepository.save(footer);
    }
    public void deleteFooter(Long id){
        footerRepository.deleteById(id);
    }
}

