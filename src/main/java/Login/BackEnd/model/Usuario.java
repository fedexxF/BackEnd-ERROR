package Login.BackEnd.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	private String email;
	private String password;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPersona")
	private List<Body> bodyList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Educacion> educacionsList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Experiencia> experienciasList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Footer> footerList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Habilidades> habilidadesList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Home> homesList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idPersona")
	private List<Proyectos> proyectosList;


	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
			)
	private Collection<Rol> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public Usuario(Long id, String nombre, String apellido, String email, String password, Collection<Rol> roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public Usuario(String nombre, String apellido, String email, String password, Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public Usuario() {
		
	}

}
