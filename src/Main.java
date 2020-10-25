import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		View view = new View();
		
		view.tituloVersao();
		view.questioneEntradas();
		
		Controller cont = new Controller();
		cont.entrada1();
		cont.entrada2();
		
		cont.operacao(0);
		
	}
}