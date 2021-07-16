
public class Password {

		private int longitud;
		private String contraseña;
		
		public Password() {
			this.longitud = 8;
			this.contraseña = generatePassword(this.longitud);
		}
		
		public Password (int longitud) {
			setLongitud(longitud);
			setContraseña(generatePassword(getLongitud()));
		}
		
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		
		// Método que devuelve una constraseña aleatoria de letras 
		// mayusculas y minusculas y caracteres especiales de la longitud especificada
		public static String generatePassword (int longitud) {	
			StringBuilder password = new StringBuilder();
			char digit;
					
			for (int i=0; i<longitud; i++) {
				digit = (char) (65 + (int)(Math.random()* ((122-65)+1))); //65 es el numero de la letra 'A' de la tabla ascii y 122 el de 'z'
				password.append(digit);
			}
			return password.toString();
		}

		@Override
		public String toString() {
			return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
		}
		
		
}
