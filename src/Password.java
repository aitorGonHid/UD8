
public class Password {

		private int longitud;
		private String contrase�a;
		
		public Password() {
			this.longitud = 8;
			this.contrase�a = generatePassword(this.longitud);
		}
		
		public Password (int longitud) {
			setLongitud(longitud);
			setContrase�a(generatePassword(getLongitud()));
		}
		
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public String getContrase�a() {
			return contrase�a;
		}

		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		
		// M�todo que devuelve una constrase�a aleatoria de letras 
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
			return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
		}
		
		
}
