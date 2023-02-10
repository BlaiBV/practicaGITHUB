import java.util.Scanner;

public class ProvaEntorns {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String frase;
		String lletra;
		
		System.out.println("Introdueix la frase");
		frase = sc.next();
		System.out.println("Introdueix el caràcter");
		lletra = sc.next();
		
		if (masLongitud(lletra)) {
			if (noExisteix(frase,lletra)) {
				System.out.println(entorns(frase,lletra));
			}
		}
	}

	private static Boolean masLongitud(String lletra) {
		if (lletra.length() > 1) {
			System.out.println("El caràcter no existeix");
			return false;
		}
		return true;
	}

	private static Boolean noExisteix(String frase, String lletra) {
		String frase1 = frase;
		for (int i = 0; i < frase1.length(); i++) {
			if (Character.toString(frase.charAt(i)) == lletra) {
				return true;
			}
		}
		System.out.println("La longitud del carácter ha de ser 1");
		return false;
	}

	private static String entorns(String frase, String lletra) {
		if (frase.length() < 2) {
			return Character.toString(frase.charAt(0));
		}
		else {
			if (lletra.equals("*")) {
				return "*" + entorns(frase.substring(1),lletra);
			}
			else {
				return frase.charAt(0) + entorns(frase.substring(1),lletra);
			}
		}
	}

}
