package es.altair.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="canciones")
public class Cancion implements Serializable {

	private Integer id;
	private String nombre;
	private Integer duracion;
	private Integer idArtista;
	
	
	private Cancion (){
		
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


	public Integer getDuracion() {
		return duracion;
	}


	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}


	public Integer getIdArtista() {
		return idArtista;
	}


	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}


	public Cancion(Integer id, String nombre, Integer duracion, Integer idArtista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.idArtista = idArtista;
	}


	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", idArtista=" + idArtista + "]";
	}
	
}
