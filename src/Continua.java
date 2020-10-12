import java.util.Locale;
import java.util.Scanner;

public class Continua {
	
	int continua;
	
	Calculo calc = new Calculo();
	
	//decide se vai continua o calculo ou não
	public void continua (double nro1, double nro2, double resultado) {
		System.out.println("Deseja continua?\nDigite 1 para sim Sim ou 2 para Nao");
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		continua = scan.nextInt();
		if(continua == 1) {
			nro1 = resultado;
			Operacao obj = new Operacao();
			System.out.println(nro1+" Digite o segundo número");
			nro2 = scan.nextDouble();
			calc.numero(nro1, nro2);
		}
		else {
			System.out.println("Obrigado por utilizar nossa calculadora!");
			return;
		}
	}
	
}
