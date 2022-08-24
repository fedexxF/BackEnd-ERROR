package Login.BackEnd.service;

import Login.BackEnd.model.Footer;
import Login.BackEnd.model.Proyectos;
import Login.BackEnd.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectosService {

    private final ProyectosRepository proyectosRepository;

    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepository) {
        this.proyectosRepository = proyectosRepository;
    }


    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepository.save(proyectos);
    }
    public List<Proyectos> findProyectos(){
        return proyectosRepository.findAll();
    }
    public Proyectos EditProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    public void deleteProyectos(Long id){
        proyectosRepository.deleteById(id);
    }
}


