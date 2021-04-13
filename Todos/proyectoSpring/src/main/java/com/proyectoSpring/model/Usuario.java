package com.proyectoSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Hay que crear una clase/entidad para cada una de las tablas de la BD sobre
 * las que queremos trabajar. Esta clase es muy similar a las que hemos visto en
 * programación, simplemente tenemos que tener en cuenta que le tenemos que
 * indicar a qué tabla de la BD pertenece esta clase, y asignar cada uno de sus
 * atributos a una columna de esa misma tabla.
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	// Esta línea tiene que estar pero no nos interesa, se autogenera cuando
	// implementamos Serializable
//	private static final long	serialVersionUID	= 3233149207833106460L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_user")
	private int				idUser;

	@Column(name = "nombre")
	private String				nombre;

	@Column(name = "apellidos")
	private String				apellidos;

	@Column(name = "telefono")
	private String				telefono;

	@Column(name = "ciudad")
	private String				ciudad;

	@Column(name = "bicicleta")
	private String				bicicleta;

	@Column(name = "edad")
	private int					edad;

	@Column(name = "sexo")
	private String				sexo;

	@Column(name = "foto")
	private String				foto;

	@Column(name = "usuario")
	private String				usuario;

	@Column(name = "contrasena")
	private String				contrasena;

	public Usuario() {

	}

	public Usuario(int idUser, String nombre, String apellidos, String telefono, String ciudad, String bicicleta,
			int edad, String sexo, String foto, String usuario, String contrasena) {
		this.idUser = idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.bicicleta = bicicleta;
		this.edad = edad;
		this.sexo = sexo;
		this.foto = foto;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(String bicicleta) {
		this.bicicleta = bicicleta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
