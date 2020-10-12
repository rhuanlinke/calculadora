import java.util.Locale;
import java.util.Scanner;

public class Operacao {
	
	double resultado;

	Continua cont = new Continua();
	Calculo calc = new Calculo();
	
	
	//faz o calculo se for válido.. foi decisão minha fazer só um método para todas as 4 operações
	public void operacao (int operacao, double nro1, double nro2) {
		if (operacao == 1) {
			resultado = nro1 + nro2;
			System.out.println("O resultado é "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 2) {
			resultado = nro1 - nro2;
			System.out.println("O resultado é "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 3) {
			resultado = nro1 / nro2;
			System.out.println("O resultado é "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else if (operacao == 4) {
			resultado = nro1 * nro2;
			System.out.println("O resultado é "+resultado);
			cont.continua(nro1, nro2, resultado);
		}
		else {
			System.out.println("Operador inválido");
			calc.calculo(nro1, nro2);
		}		
	}
}