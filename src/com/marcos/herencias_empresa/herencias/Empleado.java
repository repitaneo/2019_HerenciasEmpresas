package com.marcos.herencias_empresa.herencias;

public abstract class Empleado {

	private String nombre;
	
	public Empleado() {
		
		nombre = "Anónimo";
	}
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
	}

	
	public abstract int calcularSueldo(float irpf);
	
	
	
	
	
	public String toString() {
		
		return "Empleado "+nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
}
