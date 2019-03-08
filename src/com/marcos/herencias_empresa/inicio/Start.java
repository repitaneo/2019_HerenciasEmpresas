
package com.marcos.herencias_empresa.inicio;

import com.marcos.herencias_empresa.herencias.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Directivo d1 = new Directivo("María");
		System.out.println(d1);
		System.out.println(d1.calcularSueldo(1.2f));
		
		Operario o1 = new Operario("Carlos");
		System.out.println(o1);
		System.out.println(o1.calcularSueldo(1.2f));
		
		Oficial of1 = new Oficial("Paula");
		System.out.println(of1);
		System.out.println(of1.calcularSueldo(1.2f));
		
		Tecnico t1 = new Tecnico("Andrés");
		System.out.println(t1);
		System.out.println(t1.calcularSueldo(1.2f));
	}

}
