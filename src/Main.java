import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double nro1, nro2;
		
		System.out.println("Calculadora v1");
		System.out.println("Por favor digite os dois números que deseja calcular");
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);  //sem o locale eu não consegui fazer um scan do double utilizando . (ponto)
		nro1 = scan.nextDouble();
		nro2 = scan.nextDouble();
		Operacoes obj = new Operacoes();
		obj.numeros(nro1, nro2);
	}
}