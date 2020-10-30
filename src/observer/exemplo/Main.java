package observer.exemplo;

import observer.Observer;
import observer.Subject;

public class Main {
	
	public static void main(String[] args) {
		//CANAIS
		Canal gafanhoto = new Canal("Banco de Dados");
		Canal gafanhoto2 = new Canal("�D�");
		
		//USUARIOS
		Usuario nirton = new Usuario("nirton");

		nirton.subscribe(gafanhoto2);
		nirton.subscribe(gafanhoto);
		
		gafanhoto.sendVideo("ent�o, pessoal...");
		
		gafanhoto2.sendVideo("ent�o, pessoal..22.");
		
		nirton.unsubscribe("Banco de Dados");
		
		gafanhoto.sendVideo("Mas j� vai embora?!");
		
	}

}
