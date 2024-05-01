 package sinSemillas;

import proyectPlanta.Planta;

public class Helecho extends Planta{
	private static int CantidadH = 0;
	private int esporas;

	public Helecho(String nombreCientifico, byte codigo, short edad, int litrosRiego, long numhojas, double diametro,
			float altura, boolean conFlor, int esporas) {
		super(nombreCientifico, codigo, edad, litrosRiego, numhojas, diametro, altura, conFlor);
		this.esporas = esporas;
		CantidadH++;
	}
	
	//Este seria el que usariamos siempre ya que tiene predeterminado el valor de la propiedad nombre cientifico y a false la propiedad con flor y ademas recibimos un parametro esporas que se asignara a la propiedad esporas.
	public Helecho( byte codigo, short edad, int litrosRiego, long numhojas, double diametro,
			float altura, int esporas) {
		super("Pteridium aquilinum", codigo, edad, litrosRiego, numhojas, diametro, altura, false);
		this.esporas = esporas;
		CantidadH++;
	}
		
	public Helecho() {
		super();
		CantidadH++;
	}

	@Override
	public String produccion() {
		String frase = " Produccion: -- [Cant.hojas con esporas: "+ esporas + " = ";
		if(esporas == 1) {
			frase += "Deficiente";
		}
		else if(esporas == 2) {
			frase += "Normal";
		}
		else if(esporas == 3) {
		 frase += "Eficiente";
		}
		else if(esporas >=4 && esporas <=5) {
			frase += "Super eficiente";
		}
		else if(esporas > 5) {
			frase +="Fuera de lo normal (super produccion)";
		}
		else {
			frase += "Inactiva (sin produccion)";
		}
		frase += "]";
		return frase;
	}
	
	public static void cantidadMatas() {
		System.out.printf("[ Num de Matas Helechos: %d ] %n", CantidadH);
		System.out.println("===========================");
	}
	

	public void nacimientoHojas() {
		// TODO Auto-generated method stub
		super.nacimientoHojas(3);
	}

	public void caidaHojas() {
		super.caidaHojas(2);
	}

	public int getEsporas() {
		return esporas;
	}

	public void setEsporas(int esporas) {
		this.esporas = esporas;
	}
	
	

}
