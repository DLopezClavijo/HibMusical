package es.altair.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="estilos")
public class Estilo implements Serializable {

	private Integer id;
	private String nombre;
	
	@Override
	public String toString() {
		return "estilo [id=" + id + ", nombre=" + nombre + "]";
	}

	public Estilo(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	private Estilo(){
		
	}
	
}
