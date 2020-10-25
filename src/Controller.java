import java.util.Locale;
import java.util.Scanner;

public class Controller {
	double nro1, nro2, resultado;
	int operacao, continua;
	
	public void entrada1 () {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);  //sem o locale eu n consegui fazer um scan do double utilizando . (ponto)
		this.nro1 = scan.nextDouble();
		return;
	}
	
	public void entrada2 () {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		this.nro2 = scan.nextDouble();
		return;
	}

	public void operacao(double nro1) {
		Scanner scan = new Scanner(System.in);
		Operacao oper = new Operacao();
		View view = new View();
		while (operacao < 1 || operacao > 4) {
			view.questioneOperacao();
			operacao = scan.nextInt();
			if(operacao < 1 || operacao > 4) {
				view.invalida();
			}
		}
		if(nro1 != 0) {
			this.nro1 = nro1;
		}
		
		oper.Operacao(operacao, this.nro1, this.nro2);
		return;
	}

	public void resultado(double resultado) {
		Controller cont = new Controller();
		this.resultado = resultado;
		View view = new View();
		view.resultado(this.resultado);
		cont.continua(this.resultado);
	}

	public void continua(double resultado) {
		this.nro1 = resultado;
		View view = new View();
		Continua cont = new Continua();
		Scanner scan = new Scanner(System.in);
		while(continua != 2) {
			view.continua1();
			continua = scan.nextInt();
			if (continua == 1) {
				cont.Continua(this.nro1);
			}
			else if(continua == 2) {
				return;
			}
			else {
				view.invalida();
			}
		}
		return;
			
	}
	
}