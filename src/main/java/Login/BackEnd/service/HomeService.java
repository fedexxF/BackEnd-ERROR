package Login.BackEnd.service;

import Login.BackEnd.model.Footer;
import Login.BackEnd.model.Home;
import Login.BackEnd.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HomeService {

    private final HomeRepository homeRepository;
@Autowired
    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }


    public Home addHome(Home home) {
        return homeRepository.save(home);
    }
    public List<Home> findHome(){
        return homeRepository.findAll();
    }
    public Home EditHome(Home home){
        return homeRepository.save(home);
    }
    public void deleteHome(Long id){
        homeRepository.deleteById(id);
    }
}


