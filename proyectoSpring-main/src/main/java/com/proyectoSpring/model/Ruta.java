package com.proyectoSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruta")
public class Ruta implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_ruta")
	private int id_ruta;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "pto_inicio")
	private String pto_inicio;
	
	@Column(name = "pto_fin")
	private String pto_fin;
	
	@Column(name = "id_user")
	private int id_user;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "url_map")
	private String url_map;
	
	public Ruta() {
		
	}
	public Ruta(String nombre, String pto_inicio, String pto_fin, int id_user, String descripcion, String url_map) {
		this.nombre = nombre;
		this.pto_inicio = pto_inicio;
		this.pto_fin = pto_fin;
		this.id_user = id_user;
		this.descripcion = descripcion;
		this.url_map = url_map;
	}
	public int getId_ruta() {
		return id_ruta;
	}
	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPto_inicio() {
		return pto_inicio;
	}
	public void setPto_inicio(String pto_inicio) {
		this.pto_inicio = pto_inicio;
	}
	public String getPto_fin() {
		return pto_fin;
	}
	public void setPto_fin(String pto_fin) {
		this.pto_fin = pto_fin;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrl_map() {
		return url_map;
	}
	public void setUrl_map(String url_map) {
		this.url_map = url_map;
	}
}
