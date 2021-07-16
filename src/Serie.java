
public class Serie {
	
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constructor por defecto
	public Serie() {
		this.temporadas = 3;
		this.entregado = false;
	}
	
	//Constructores parametrizados
	public Serie (String titulo, String creador) {
		setTitulo(titulo);
		this.temporadas = 3;
		this.entregado = false;
		setCreador(creador);
	}
	
	public Serie (String titulo, int temporadas, String genero, String creador) {
		setTitulo(titulo);
		setTemporadas(temporadas);
		this.entregado = false;
		setGenero(genero);
		setCreador(creador);
	}
	
	//GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
}
