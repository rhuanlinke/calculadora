import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double nro1, nro2;
		
		System.out.println("Calculadora v1");
		System.out.println("Por favor digite os dois n�meros que deseja calcular");
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);  //sem o locale eu n�o consegui fazer um scan do double utilizando . (ponto)
		nro1 = scan.nextDouble();
		nro2 = scan.nextDouble();
		Calculo calc = new Calculo();
		calc.numero(nro1, nro2);
	}
}