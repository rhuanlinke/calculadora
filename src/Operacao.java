import java.util.Locale;
import java.util.Scanner;

public class Operacao {
	
	double resultado;
	
	//faz o calculo se for v�lido.. foi decis�o minha fazer s� um m�todo para todas as 4 opera��es
	public void operacao (int operacao, double nro1, double nro2) {
		Calculo calc = new Calculo();
		Continua cont = new Continua();
		if (operacao == 1) {
			resultado = nro1 + nro2;
			System.out.println("O resultado � "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 2) {
			resultado = nro1 - nro2;
			System.out.println("O resultado � "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 3) {
			resultado = nro1 / nro2;
			System.out.println("O resultado � "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 4) {
			resultado = nro1 * nro2;
			System.out.println("O resultado � "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else {
			System.out.println("Operador inv�lido");
			calc.calculo(nro1, nro2);
		}		
	}
}