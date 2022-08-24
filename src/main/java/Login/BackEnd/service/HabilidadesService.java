package Login.BackEnd.service;

import Login.BackEnd.model.Footer;
import Login.BackEnd.model.Habilidades;
import Login.BackEnd.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HabilidadesService {

    private final HabilidadesRepository habilidadesRepository;

@Autowired
    public HabilidadesService(HabilidadesRepository habilidadesRepository) {
        this.habilidadesRepository = habilidadesRepository;
    }
    public Habilidades addHabilidades(Habilidades habilidades) {
        return habilidadesRepository.save(habilidades);
    }
    public List<Habilidades> findHabilidades(){
        return habilidadesRepository.findAll();
    }
    public Habilidades EditHabilidades(Habilidades habilidades){
        return habilidadesRepository.save(habilidades);
    }
    public void deleteHabilidades(Long id){
        habilidadesRepository.deleteById(id);
    }
}

