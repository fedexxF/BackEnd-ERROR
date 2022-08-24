package Login.BackEnd.service;

import Login.BackEnd.model.Body;
import Login.BackEnd.repository.BodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;

@Service
@Transactional
public class BodyService {
    private final BodyRepository bodyRepository;

    @Autowired
    public BodyService(BodyRepository bodyRepository) {
        this.bodyRepository = bodyRepository;
    }
    public Body addBody(Body body) {
        return bodyRepository.save(body);
    }
    public List<Body> findBody(){
        return bodyRepository.findAll();
    }
    public Body EditBody(Body body){
        return bodyRepository.save(body);
    }
    public void deleteBody(Long id){
        bodyRepository.deleteById(id);
    }
}
