package com.marcos.herencias_empresa.herencias;

public class Directivo extends Empleado {

	public Directivo() {
			
		super();
	}
	
	
	public Directivo(String nombre) {
	
		super(nombre);
	}
	
	
	public String toString() {
		
		return super.toString()+" -> Directivo";
	}
	
	
	
	

	@Override
	public int calcularSueldo(float irpf) {
		return 1000+3000;
	}
		
}
