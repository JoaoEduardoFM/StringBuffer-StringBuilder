package String;

public class StringTeste {
	
	public static void main(String[] args) {
		
		String[] letras = {"b","c","d","e","f"};
		
		String alfabeto = "";
		
		for(String letra: letras) {
			alfabeto += letra;
		}		
		System.out.println(alfabeto);
		/* StringBuffer = thread safe
		 *
		 * Thread-Safe garanti que não haverá conflito entre Threads concorrentes,
		 * ou seja, garante a segurança de aplicações que são Multi-Thread.
		 */
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		alfabeto= sb.toString();
		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());
		
		/* StringBuilder = não é thread safe
		 * 
		 * usado em aplicações simples
		 */	 
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
	}
}
