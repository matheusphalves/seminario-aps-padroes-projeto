package observer.exemplo;

import observer.Observer;
import observer.Subject;

public class Main {
	
	public static void main(String[] args) {
		//CANAIS
		Canal gafanhoto = new Canal("Banco de Dados");
		Canal gafanhoto2 = new Canal("ÉDÊ");
		
		//USUARIOS
		Usuario nirton = new Usuario("nirton");

		nirton.subscribe(gafanhoto2);
		nirton.subscribe(gafanhoto);
		
		gafanhoto.sendVideo("então, pessoal...");
		
		gafanhoto2.sendVideo("então, pessoal..22.");
		
		nirton.unsubscribe("Banco de Dados");
		
		gafanhoto.sendVideo("Mas já vai embora?!");
		
	}

}
