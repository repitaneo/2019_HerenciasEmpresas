package com.marcos.herencias_empresa.herencias;

public class Oficial extends Operario {

	public Oficial() {
		
		super();
	}
	
	public Oficial(String nombre) {
		
		super(nombre);
	}
	
	
	public String toString() {
		
		return super.toString()+" -> Oficial";
	}
	
	public int calcularSueldo(float irpf) {
		
		return super.calcularSueldo(irpf)+1000;
	}	
}
