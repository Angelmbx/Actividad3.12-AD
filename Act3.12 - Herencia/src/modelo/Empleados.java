package modelo;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Empleados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5786876954470609192L;
	@Id //atributo clave
	private String dni;//ponemos protected para que todas las subclases puedan heredar esta clave primaria
	private String nombre;
	private String telefono;
	@ManyToOne(fetch = FetchType.LAZY) //en este caso es el lado N y lado Propietario pues tiene la columna con la foreing key que mantiene la relacion
	@JoinColumn(name="empresa_id")//el nombre de la columna será empresa_id (prueba para no llamarle cif (enunciado)) y los valores de esa columna se rellenan gracias al JoinColumn(¿?)
	private Empresas empresa;
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
	
	
	public Empresas getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}
	public abstract float calculoNomina();
	
}
	

