package proyectPlanta;

public abstract class Planta {
	private String nombreCientifico;
	private byte codigo;
	private short edad;
	private int litrosRiego;
	private long numhojas;
	private double diametro;
	private float altura;
	private boolean conFlor;
	
	// constructo para dar valores
	public Planta(String nombreCientifico, byte codigo, short edad, int litrosRiego, long numhojas, double diametro,
			float altura, boolean conFlor) {
		this.nombreCientifico = nombreCientifico;
		this.codigo = codigo;
		this.edad = edad;
		this.litrosRiego = litrosRiego;
		this.numhojas = numhojas;
		this.diametro = diametro;
		this.altura = altura;
		this.conFlor = conFlor;
	}
	// constructor que sirve para darle valor por defecto a las propiedades
	public Planta() {
		this("", (byte)0,(short)0, 0, 0, 0.0, 0.0F, true);
	}
	
	//muestra por consola la info del objeto manzano/helecho utilizando los metodos get, tambien podriamos usar directamente las propiedades.
	public void show() {
		System.out.printf("Especie: %s, codigo: %d, edad: %d años, litros de riego: %d/semanales, Hojas: %d, diametro: %.2f, altura: %.2f.", 	getNombreCientifico(), getCodigo(), getEdad(), getLitrosRiego(), getNumhojas(), getDiametro(), getAltura());
	}
	// crea una variable local de tipo string y luego la devuelve, por lo tanto el metodo siver para devolver un string
	public String produccion() {
		String produccion = "Este metodo devuelve la produccion de una planta.";
		return produccion;
	}
	// estos dos metodos estan el la clase padre para que siempre funcione igual independientemente de que hijo los llame
	public void nacimientoHojas(int hojas) {
		int i = 0;
		while(i < 12) {
			this.numhojas+=hojas;
			i++;
		}
	}
	public void caidaHojas(int hojas) {
		for(int i = 0; i < 12; i++) {
			this.numhojas-=hojas;
		}
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public byte getCodigo() {
		return codigo;
	}

	public void setCodigo(byte codigo) {
		this.codigo = codigo;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public int getLitrosRiego() {
		return litrosRiego;
	}

	public void setLitrosRiego(int litrosRiego) {
		this.litrosRiego = litrosRiego;
	}

	public long getNumhojas() {
		return numhojas;
	}

	public void setNumhojas(long numhojas) {
		this.numhojas = numhojas;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public boolean isConFlor() {
		return conFlor;
	}

	public void setConFlor(boolean conFlor) {
		this.conFlor = conFlor;
	}
	
}

