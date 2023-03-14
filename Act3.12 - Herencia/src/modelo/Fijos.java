package modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="empleados_id") //aqui hay una relacion de herencia con el padre JOINED. Creamos una columna extra que crea una Foreign key que apunta a la primaria de empleados
public class Fijos extends Empleados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5280512456811629953L;
	/**
	 * 
	 */
	
	private int salarioBase;
	private int trienios;
	
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getTrienios() {
		return trienios;
	}
	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}
	@Override
	public float calculoNomina() {
		float sueldo =(salarioBase+trienios)-(salarioBase+trienios)*this.getPorecentaRetencion();
		
				return sueldo;
	}
	
	
	
	
}
