   package main;

import conSemilas.Manzano;
import sinSemillas.Helecho;

public class PlantaMain {
	public static void main(String[] args) {

		Manzano m1 = new Manzano((byte)1, (short)8, 20, 200, 21.40 ,2.50F,'B');
		Manzano m2 = new Manzano((byte)2, (short)10, 24, 300, 27.30 ,2.78F,'A');
		Manzano m3 = new Manzano((byte)3, (short)25, 25, 300, 24.40 ,2.93F,'A');
		Manzano m4 = new Manzano((byte)4, (short)2, 10, 100, 3.56 ,1.07F,'X');
		Manzano m5 = new Manzano((byte)5, (short)5, 15, 100, 7.82 ,2.34F,'C');
		
		Manzano.cantidadArboles();
		
		m1.show();
		System.out.printf("%s%n",m1.produccion());
		m2.show();
		System.out.printf("%s%n",m2.produccion());
		m3.show();
		System.out.printf("%s%n",m3.produccion());
		m4.show();
		System.out.printf("%s%n",m4.produccion());
		m5.show();
		System.out.printf("%s%n",m5.produccion());
		
		m1.tamano();
		m4.tamano();
		//Planta p3 = new Helecho();
//		String prueba = m1.produccion();
//		System.out.println(prueba); 
	
//		Planta p1 = new Helecho();

		Helecho h1 = new Helecho((byte)1, (short)4, 8, 7, 2.7, 0.50F, 2);
		Helecho h2 = new Helecho((byte)2, (short)1, 10, 3, 1.2, 0.204F, 0);
		Helecho h3 = new Helecho((byte)3, (short)4, 8, 6, 2.5, 0.43F, 5);
		Helecho h4 = new Helecho((byte)4, (short)10, 6, 25, 7.89, 120F, 7);
		Helecho h5 = new Helecho((byte)5, (short)2, 10, 4, 1.7, 0.302F, 1);
		
		
		Helecho.cantidadMatas();
		
		h1.show();
		System.out.printf("%s%n",h1.produccion());
		h2.show();
		System.out.printf("%s%n",h2.produccion());
		h3.show();
		System.out.printf("%s%n",h3.produccion());
		h4.show();
		System.out.printf("%s%n",h4.produccion());
		h5.show();
		System.out.printf("%s%n",h5.produccion());

		
		h1.nacimientoHojas();
//		h1.show();
		System.out.println();
		h1.caidaHojas();
//		7 hojas que tiene 12*3= 36 que nacen - 12*2=24 que mueren igual a 7+36=43, 43-24=19 en total quedan a final de año 19 hojas
		h1.show();
//		System.out.println();
		h2.nacimientoHojas();
//		h2.show();
		System.out.println();
		h2.caidaHojas();
		h2.show();
		
		
	}
}
