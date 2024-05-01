package conSemilas;

import proyectPlanta.Planta;

public class Manzano extends Planta {
	 private static int CantidadM = 0;
	 private char clase;

	public Manzano(String nombreCientifico, byte codigo, short edad, int litrosRiego, long numhojas, double diametro,
			float altura, boolean conFlor, char clase) {
		super(nombreCientifico, codigo, edad, litrosRiego, numhojas, diametro, altura, conFlor);
		this.clase=clase;
		CantidadM++; // propiedad static que aumenta por cada objeto creado
	}
	
	//Este seria el que usariamos siempre ya que tiene predeterminado el valor de la propiedad nombre cientifico y a true la propiedad con flor y ademas recibimos un parametro clase que se asignara a la propiedad clase.
	public Manzano(byte codigo, short edad, int litrosRiego, long numhojas, double diametro,
			float altura, char clase) {
		super("Malus", codigo, edad, litrosRiego, numhojas, diametro, altura, true);
		this.clase=clase;
		CantidadM++;
	}
	
	public Manzano() {
		super();
		CantidadM++;	
	}
	
	@Override
	public String produccion() {
		String produccion = " Produccion: -- [";
		switch(getClase()) {
			case 'A':
				produccion += "200-300 manzanas anuales";
			break;
			case 'B':
				produccion += "100-200 manzanas anuales";
			break;
			case 'C':
				produccion += "25-100 manzanas anuales";
			break;
			default: 
				produccion += "Aun no tiene producción";
		}
		produccion += "]";
		return produccion;
	}
	
	public static void cantidadArboles () {
		System.out.printf("[ Num Arboles de Manzanos: %d ]%n", CantidadM);
		System.out.println("===========================");
	}

	public void nacimientoHojas() {
		// TODO Auto-generated method stub
		super.nacimientoHojas(40);
	}

	public void caidaHojas() {
		super.caidaHojas(20);
	}
	
	public void tamano() {
		String tamano = getAltura() < 2 ? "pequeño" : "grande";
		System.out.printf("El arbol con codigo:%d es %s.%n",getCodigo(), tamano);
	}
	
	public char getClase() {
		return clase;
	}

	public void setClase(char clase) {
		this.clase = clase;
	}

	
}
