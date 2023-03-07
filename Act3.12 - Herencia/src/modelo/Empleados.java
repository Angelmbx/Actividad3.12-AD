package modelo;

import java.io.Serializable;

public abstract class Empleados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5786876954470609192L;
	private String dni;
	private String nombre;
	private String telefono;
	private float porecentaRetencion;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public float getPorecentaRetencion() {
		return porecentaRetencion;
	}
	public void setPorecentaRetencion(float porecentaRetencion) {
		this.porecentaRetencion = porecentaRetencion;
	}
	
	public abstract float calculoNomina();
	
}
	

