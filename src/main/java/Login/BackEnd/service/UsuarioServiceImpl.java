package Login.BackEnd.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import Login.BackEnd.model.Proyectos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import Login.BackEnd.controller.dto.UsuarioRegistroDTO;
import Login.BackEnd.model.Rol;
import Login.BackEnd.model.Usuario;
import Login.BackEnd.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	private UsuarioRepository usuarioRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	public List<Usuario> findUsuario(Long id){
		return usuarioRepository.findAll();
	}
	public Usuario EditUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	public void deleteUsuario(Long id){
		usuarioRepository.deleteById(id);
	}

	public Usuario findUserById (Long id){
		return usuarioRepository.findById(id).orElseThrow();
	}


	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(), 
				registroDTO.getApellido(),registroDTO.getEmail(),
				passwordEncoder.encode(registroDTO.getPassword()),Arrays.asList(new Rol( "ROLE_USER")));
		return usuarioRepository.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inv??lidos");
		}
		return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}
	
	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}
}
