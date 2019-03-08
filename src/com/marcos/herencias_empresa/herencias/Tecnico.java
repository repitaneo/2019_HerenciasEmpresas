package com.marcos.herencias_empresa.herencias;

public class Tecnico extends Operario {

	
	public Tecnico() {
		
		super();
	}
	
	public Tecnico(String nombre) {
		
		super(nombre);
	}
	
	
	public String toString() {
		
		return super.toString()+" -> Tecnico";
	}

	public int calcularSueldo(float irpf) {
		
		return super.calcularSueldo(irpf)+300;
	}	
	
}
