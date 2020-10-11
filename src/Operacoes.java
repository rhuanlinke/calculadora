import java.util.Locale;
import java.util.Scanner;

public class Operacoes {
	
	double nro1 = 0.0, nro2 = 0.0, resultado = 0.0;
	int validador = 0, operacao, continuar;
	
	//recebe os números da Main
	public void numeros (double nro1, double nro2) {		
		this.nro1 = nro1;
		this.nro2 = nro2;
		Operacoes obj = new Operacoes();
		obj.calculo(nro1, nro2);
	}
	
	//decide qual vai ser o calculo a ser feito nesses números
	public void calculo (double nro1, double nro2) {
		this.nro1 = nro1;
		this.nro2 = nro2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a operação? \n1. Soma\n2. Subtrai\n3. Divite\n4. Multiplica");
		operacao = scan.nextInt();
		Operacoes obj = new Operacoes();
		obj.operacoes(operacao, nro1, nro2);
	}
	
	//faz o calculo se for válido.. foi decisão minha fazer só um método para todas as 4 operações
	public void operacoes (int operacao, double nro1, double nro2) {
		this.nro1 = nro1;
		this.nro2 = nro2;
		Operacoes obj = new Operacoes();
		this.operacao = operacao;
		if (operacao == 1) {
			resultado = nro1 + nro2;
			System.out.println("O resultado é "+resultado);
			obj.continuar(nro1, nro2, resultado);
		}
		else if (operacao == 2) {
			resultado = nro1 - nro2;
			System.out.println("O resultado é "+resultado);
			obj.continuar(nro1, nro2, resultado);
		}
		else if (operacao == 3) {
			resultado = nro1 / nro2;
			System.out.println("O resultado é "+resultado);
			obj.continuar(nro1, nro2, resultado);
		}
		else if (operacao == 4) {
			resultado = nro1 * nro2;
			System.out.println("O resultado é "+resultado);
			obj.continuar(nro1, nro2, resultado);
		}
		else {
			System.out.println("Operador inválido");
			obj.calculo(this.nro1, this.nro2);
		}		
	}
	
	//decide se vai continuar o calculo ou não
	public void continuar (double nro1, double nro2, double resultado) {
		this.nro1 = nro1;
		this.nro2 = nro2;
		this.resultado = resultado;
		System.out.println("Deseja continuar?\nDigite 1 para sim Sim ou 2 para Nao");
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		continuar = scan.nextInt();
		if(continuar == 1) {
			nro1 = resultado;
			Operacoes obj = new Operacoes();
			System.out.println(nro1+" Digite o segundo número");
			nro2 = scan.nextDouble();
			obj.numeros(nro1, nro2);
		}
		else {
			System.out.println("Obrigado por utilizar nossa calculadora!");
			return;
		}
	}
	
}