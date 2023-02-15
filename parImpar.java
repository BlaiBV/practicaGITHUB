import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nums;
		int num;
		int suma = 0;
		nums = entrada.nextLine();
		
		for (int i = 0; i < nums.split(",").length; i++) {
			num = Integer.parseInt(nums.split(",")[i].replaceAll(" ",""));
			suma += num;
		}
		
		
		if (suma%2 == 0) {
			System.out.println(suma + " és parell");
		}
		else {
			System.out.println(suma + " és imparell");
		}
	}

}




