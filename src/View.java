public class View {

	public void invalida() {
		System.out.println("Op��o inv�lida, digite novamente");
		return;
		
	}

	public void tituloVersao() {
		System.out.println("Calculadora v1");
		return;		
	}

	public void questioneEntradas() {
		System.out.println("Por favor digite os dois numeros que deseja calcular");
		return;
		
	}

	public void questioneOperacao() {
		System.out.println("Qual a opera��o deseja realizar?\n1. Soma\n2. Subtrai\n3. Divite\n4. Multiplica");
		return;
		
	}

	public void resultado(double resultado) {
		System.out.println("O resultado eh: "+resultado+"\n");
		return;
		
	}

	public void continua1() {
		System.out.println("Deseja continuar?\n1. SIM\n2. N�O");
		return;
		
	}
	
	public void continua2() {
		System.out.println("Digite o segundo n�mero");
		return;
	}
	
}