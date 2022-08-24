package Login.BackEnd.controller;


import Login.BackEnd.model.Usuario;
import Login.BackEnd.service.UsuarioService;
import Login.BackEnd.service.UsuarioServiceImpl;
import org.hibernate.sql.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    private final UsuarioServiceImpl usuarioServiceImpl;

    public UsuarioController(UsuarioService usuarioService, UsuarioServiceImpl usuarioServiceImpl) {
        this.usuarioServiceImpl = usuarioServiceImpl;
    }
    @GetMapping("id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
        Usuario usuario=usuarioServiceImpl.findUserById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Usuario>EditUsuario(@RequestBody Usuario usuario){
       Usuario updateUsuario=usuarioServiceImpl.EditUsuario(usuario);
    return new ResponseEntity<>(updateUsuario, HttpStatus.OK);

    }

}
