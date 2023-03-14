package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.*;


@Entity
@Table(name="empresa") //para añadir esto, y que no de error, tengo que añadir la biblioteca de hibernate Click derecho> build path > add libraries external.... y importar javax.persistence.*
public class Empresas implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id //se aplica Id al atributo que será campo clave
	//@Column(name="empresa_cif", length=15) si quiero cambiarle el nombre
	private String cif;
	private String nombre;
	private String direccion;
	private String telefono;
	@OneToMany(mappedBy = "empresa") //Lado inverso lleva mappedBy (en 1 N siempre OneToMany lleva mappedby) Dentro de mappedby Se pone EL ATRIBUTO del otro lado de la relacion que permite viajar a ella
	//Por defecto todas las que terminan en ToMany, es lazy. En las ToOne por defecto es eaguer(cada vez que trae empleado trae tambien una empresa¿?). Es el lado inverso(lado 1) y el propietario es N
	private Set<Empleados> empleados= new HashSet<>();
	
	
	
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Set<Empleados> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Set<Empleados> empleados) {
		this.empleados = empleados;
	}
	
	
	

}
