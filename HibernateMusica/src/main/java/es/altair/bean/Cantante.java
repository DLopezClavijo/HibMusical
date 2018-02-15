package es.altair.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cantantes")
public class Cantante implements Serializable{

	//REMEMBER THIS!!!!!!!!
	@Id()
	//REMEMBER THIS!!!!!!!!
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
	private String pais;
	private Integer idEstilo;
	
	@OneToMany(mappedBy="cantante", cascade=CascadeType.ALL)
	private Set<Cancion> cancion;
	
	public Cantante() {
		
	}

	public Cantante(Integer id, String nombre, String apellidos, Integer edad, String pais, Integer idEstilo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
		this.idEstilo = idEstilo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getIdEstilo() {
		return idEstilo;
	}

	public void setIdEstilo(Integer idEstilo) {
		this.idEstilo = idEstilo;
	}

	@Override
	public String toString() {
		return "Cantante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", pais="
				+ pais + ", idEstilo=" + idEstilo + "]";
	}
	
	
}
