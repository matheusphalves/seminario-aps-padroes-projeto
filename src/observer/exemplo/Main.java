package observer.exemplo;

public class Main {
	
	public static void main(String[] args) {
		//CANAIS
		Canal gafanhoto = new Canal("Banco de Dados");
		Canal gafanhoto2 = new Canal("�D�");
		
		//USUARIOS
		Usuario nirton = new Usuario("nirton", gafanhoto);

		System.out.println(nirton);
		gafanhoto.sendVideo("ent�o, pessoal...");
		
		gafanhoto2.sendVideo("ent�o, pessoal..22.");
		
		gafanhoto.sendVideo("Mas j� vai embora?!");
		
	}

}
