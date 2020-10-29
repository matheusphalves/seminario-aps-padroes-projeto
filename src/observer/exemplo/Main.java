package observer.exemplo;

import observer.Observer;
import observer.Subject;

public class Main {
	
	public static void main(String[] args) {
		//CANAIS
		Canal gafanhoto = new Canal("Banco de Dados");
		
		//USUARIOS
		Usuario nirton = new Usuario("nirton");

		
		
		nirton.subscribe(gafanhoto);
		
		gafanhoto.sendNote("ent�o, pessoal...");
		
		nirton.unsubscribe(gafanhoto);
		
		gafanhoto.sendNote("Mas j� vai embora?!");
		
		
	}

}
