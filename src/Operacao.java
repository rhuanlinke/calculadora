import java.util.Locale;
import java.util.Scanner;

public class Operacao {
	
	//faz o calculo se for v�lido.. foi decis�o minha fazer s� um m�todo para todas as 4 opera��es
	public void Operacao (int operacao, double nro1, double nro2) {
		if (operacao == 1) {
			Soma soma = new Soma();
			soma.Soma(nro1, nro2);
		}
		else if (operacao == 2) {
			Subtrai subt = new Subtrai();
			subt.Subtrai(nro1, nro2);
		}
		else if (operacao == 3) {
			Divide divi = new Divide();
			divi.Divide(nro1, nro2);
		}
		else if (operacao == 4) {
			Multiplica mult = new Multiplica();
			mult.Multiplica(nro1, nro2);
		
		}
	}
}