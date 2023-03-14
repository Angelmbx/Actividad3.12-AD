package main;

import java.time.LocalDate;

import modelo.Empresas;
import modelo.Fijos;
import modelo.Temporales;
import modelo.servicio.EmpleadoServicio;
import modelo.servicio.EmpresaServicio;
import modelo.servicio.IEmpleadoServicio;
import modelo.servicio.IEmpresaServicio;

public class main {
	
	
	public static IEmpresaServicio empresaServicio = new EmpresaServicio(); //public static!!!
	public static IEmpleadoServicio empleadoServicio = new EmpleadoServicio(); 
	
	
	
	public static void main(String[] args) {
	Empresas empresa= new Empresas();
	empresa.setCif("11111bbbbb");
	empresa.setDireccion("Vigo");
	empresa.setNombre("My compania");
	empresa.setTelefono("985222999");
	
	empresaServicio.create(empresa);

	Fijos fijo_1 = new Fijos();
	fijo_1.setDni("1234444");
	fijo_1.setEmpresa(empresa);
	fijo_1.setNombre("Soy fijo");
	fijo_1.setSalarioBase(3000);
	fijo_1.setTelefono("1234444");
	fijo_1.setTrienios(0);
	
	Temporales temp = new Temporales();
	temp.setDni("111111");
	temp.setNombre("Soy temporal");
	temp.setTelefono("telefono");
	temp.setEmpresa(empresa);
	temp.setFechaFin(LocalDate.of(2023, 10, 1));
	temp.setFechaInicio(LocalDate.of(2022, 5, 1));
	temp.setPagoDia(100);
	temp.setSuplemento(200);

	empleadoServicio.create(fijo_1);
	empleadoServicio.create(temp);
	
	}
	
	
}
