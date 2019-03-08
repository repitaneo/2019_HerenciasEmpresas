package com.marcos.herencias_empresa.herencias;

public class Operario extends Empleado {

	public Operario() {
		
		super();
	}
	
	public Operario(String nombre) {
		
		super(nombre);
	}
	
	
	public String toString() {
		
		return super.toString()+" -> Operario";
	}
	
	
	public int calcularSueldo(float irpf) {
		
		return 1000+500;
	}	
	
}
