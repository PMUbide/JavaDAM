package com.proyectoSpring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "grupo")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_grupo")
	private int id_grupo;
	
	@Column(name = "fecha_salida")
	private String fecha_salida;
	
	@Column(name = "id_ruta")
	private int id_ruta;
	
	@Column(name = "aforo_max")
	private int aforo_max;
	
	@Column(name = "apuntados")
	private int apuntados;	
	
	@Column(name = "completo")
	private int completo;	
	
	@Column(name = "fecha_creacion")
	private String fecha_creacion;	
	
	public Grupo() {
		
	}

	public Grupo(String fecha_salida, int id_ruta, int aforo_max, int apuntados, int completo, String fecha_creacion) {
		this.fecha_salida = fecha_salida;
		this.id_ruta = id_ruta;
		this.aforo_max = aforo_max;
		this.apuntados = 1;
		this.completo = completo;
		this.fecha_creacion = fecha_creacion;
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	public String getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public int getId_ruta() {
		return id_ruta;
	}

	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}

	public int getAforo_max() {
		return aforo_max;
	}

	public void setAforo_max(int aforo_max) {
		this.aforo_max = aforo_max;
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

	public String getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
	
	
}
