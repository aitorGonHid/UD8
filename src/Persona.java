
public class Persona {
	
	private final char SEXO_HOMBRE = 'H';
	private final char SEXO_MUJER = 'M';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	// Constructor por defecto
	public Persona() {
		this.dni = "00000000A";
		this.sexo = SEXO_HOMBRE;
	}
	// Constructor parametrizado - los valores no introducidos como parametro se setean segun el constructor por defecto
	public Persona(String nombre, int edad, char sexo) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
	}
	
	// Constructor parametrizado con todos los campos
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = checkSexo(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
		
	// Metodo comprobación valor sexo válido
	public char checkSexo(char sexo) {
		switch(Character.toString(sexo).toUpperCase()) {
		case ("M"):
			return SEXO_MUJER;
		default:
			return SEXO_HOMBRE;
		}
	}
	
	@Override
	public String toString() {
		return "Persona [SEXO_HOMBRE=" + SEXO_HOMBRE + ", SEXO_MUJER=" + SEXO_MUJER + ", nombre=" + nombre + ", edad="
				+ edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
}
