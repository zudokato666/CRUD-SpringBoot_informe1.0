package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informes")
public class Informe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo",nullable = false,length = 75)
	private String titulo;
	
	@Column(name = "descripcion",nullable = false,length = 250)
	private String descripcion;
	
	@Column(name = "fecha",nullable = false,length = 25)
	private String fecha;
	
	public Informe() {
		
	}

	public Informe(Long id, String titulo, String descripcion, String fecha) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	public Informe( String titulo, String descripcion, String fecha) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Informe [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
	
	
}
