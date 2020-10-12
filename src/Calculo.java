import java.util.Locale;
import java.util.Scanner;

public class Calculo {
	
	int operacao;
	
	    //recebe os números da Main
		public void numero (double nro1, double nro2) {
			Calculo calc = new Calculo();
			calc.calculo(nro1, nro2);
		}
		
		//decide qual vai ser o calculo a ser feito nesses números
		public void calculo (double nro1, double nro2) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual a operação?\n1. Soma\n2. Subtrai\n3. Divite\n4. Multiplica");
			operacao = scan.nextInt();
			Operacao oper = new Operacao();
			oper.operacao(operacao, nro1, nro2);
		}

}
