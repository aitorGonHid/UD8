
public class Electrodomestico {
	
	private final String COLOR_BLANCO = "BLANCO";
	private final String COLOR_NEGRO = "NEGRO";
	private final String COLOR_ROJO = "ROJO";
	private final String COLOR_AZUL = "AZUL";
	private final String COLOR_GRIS = "GRIS";
	
	private final char CONSUMO_A = 'A';
	private final char CONSUMO_B = 'B';
	private final char CONSUMO_C = 'C';
	private final char CONSUMO_D = 'D';
	private final char CONSUMO_E = 'D';
	private final char CONSUMO_F = 'E';
	
	
	private double precioBase;
	private String color;
	private char consumo;
	private double peso;
	
	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = COLOR_BLANCO;
		this.consumo = CONSUMO_F;
		this.peso = 5;
	}
	// Constructor parametrizado con 2 atributos
	public Electrodomestico(double precio, double peso) {
		setPrecioBase(precio);
		setPeso(peso);
		this.color = COLOR_BLANCO;
		this.consumo = CONSUMO_F;
	}
	// Constructor parametrizado con todos los atributos
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		setPrecioBase(precio);
		setColor(color);
		setConsumo(consumo);
		setPeso(peso);
	}
	// GETTERS & SETTERS
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = checkColor(color);
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = checkConsumo(consumo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// METODOS COMPROBACION VALORES
	// Metodo qUE comprueba que el color introducido es válido, en caso contratio devuelve COLOR_BLANCO
	public String checkColor(String color) {
		switch(color.toUpperCase()) {
		case ("NEGRO"):
			return COLOR_NEGRO;
		case ("ROJO"):
			return COLOR_ROJO;
		case ("AZUL"):
			return COLOR_AZUL;
		case ("GRIS"):
			return COLOR_GRIS;
		default:
			return COLOR_BLANCO;
		}
	}
	//Metodo que comprueba que el valor de consumo introducido sea válido, en caso contratio devuelve CONSUMO_F
	public char checkConsumo(char consumo) {
		switch(Character.toString(consumo).toUpperCase()) {
		case ("A"):
			return CONSUMO_A;
		case ("B"):
			return CONSUMO_B;
		case ("C"):
			return CONSUMO_C;
		case ("D"):
			return CONSUMO_D;
		case ("E"):
			return CONSUMO_E;
		default:
			return CONSUMO_F;
		}
	}
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
}
