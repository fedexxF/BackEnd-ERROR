package Login.BackEnd.service;

import Login.BackEnd.model.Footer;
import Login.BackEnd.model.Header;
import Login.BackEnd.repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HeaderService {

    private final HeaderRepository headerRepository;
    @Autowired
    public HeaderService(HeaderRepository headerRepository) {
        this.headerRepository = headerRepository;
    }

    public Header addHeader(Header header) {
        return headerRepository.save(header);
    }
    public List<Header> findHeader(){
        return headerRepository.findAll();
    }
    public Header EditHeader(Header header){
        return headerRepository.save(header);
    }
    public void deleteHeader(Long id){
        headerRepository.deleteById(id);
    }
}

