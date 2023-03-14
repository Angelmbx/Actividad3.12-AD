package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="empleados_id")
public class Temporales extends Empleados implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4633591203267830174L;
	private LocalDate fechaInicio; // al ser localDate no se usa @Temporal
	private LocalDate fechaFin;
	float pagoDia;
	float suplemento;
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public float getPagoDia() {
		return pagoDia;
	}
	public void setPagoDia(float pagoDia) {
		this.pagoDia = pagoDia;
	}
	public float getSuplemento() {
		return suplemento;
	}
	public void setSuplemento(float suplemento) {
		this.suplemento = suplemento;
	}
	@Override
	public float calculoNomina() {
		
		long diferenciaDias= ChronoUnit.DAYS.between(fechaInicio, fechaFin);
		
		float sueldo =pagoDia*(diferenciaDias)-pagoDia*(diferenciaDias)*this.getPorecentaRetencion()+suplemento;

		return sueldo;
	}
	
	

}
