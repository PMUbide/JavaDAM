package com.proyectoSpring.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "grupo")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_grupo")
	private int id_grupo;
	
	@Column(name = "fechaSalida")
	private String fechaSalida;
	
	@Column(name = "id_ruta")
	private int id_ruta;
	
	@Column(name = "aforoMax")
	private int aforoMax;
	
	@Column(name = "apuntados")
	private int apuntados;	
	
	@Column(name = "completo")
	private int completo;	
	
	@Column(name = "fechaCreacion")
	private String fechaCreacion;	
	
	public Grupo() {
		
	}

	public Grupo(String fechaSalida, int id_ruta, int aforoMax, int apuntados, int completo, String fechaCreacion) {
		this.fechaSalida = fechaSalida;
		this.id_ruta = id_ruta;
		this.aforoMax = aforoMax;
		this.apuntados = apuntados;
		this.completo = completo;
		this.fechaCreacion = fechaCreacion;
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public int getAforoMax() {
		return aforoMax;
	}

	public void setAforoMax(int aforoMax) {
		this.aforoMax = aforoMax;
	}

	public int getApuntados() {
		return apuntados;
	}

	public void setApuntados(int apuntados) {
		this.apuntados = apuntados;
	}

	public int getCompleto() {
		return completo;
	}

	public void setCompleto(int completo) {
		this.completo = completo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
}
