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
		 * Thread-Safe garanti que n�o haver� conflito entre Threads concorrentes,
		 * ou seja, garante a seguran�a de aplica��es que s�o Multi-Thread.
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
		
		/* StringBuilder = n�o � thread safe
		 * 
		 * usado em aplica��es simples
		 */	 
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
	}
}
