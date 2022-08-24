package Login.BackEnd.service;

import Login.BackEnd.model.Body;
import Login.BackEnd.model.Educacion;
import Login.BackEnd.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository educacionRepository;

    @Autowired
    public EducacionService(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }


    public Educacion addEduacion(Educacion educacion) {
        return educacionRepository.save(educacion);
    }
    public List<Educacion> findEducacion(){
        return educacionRepository.findAll();
    }
    public Educacion EditEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public void deleteEducacion(Long id){
        educacionRepository.deleteById(id);
    }
}
