package observer.exemplo;

public class Main {
	
	public static void main(String[] args) {
		//CANAIS
		Canal gafanhoto = new Canal("Banco de Dados");
		Canal gafanhoto2 = new Canal("ÉDÊ");
		
		//USUARIOS
		Usuario nirton = new Usuario("nirton", gafanhoto);

		System.out.println(nirton);
		gafanhoto.sendVideo("então, pessoal...");
		
		gafanhoto2.sendVideo("então, pessoal..22.");
		
		gafanhoto.sendVideo("Mas já vai embora?!");
		
	}

}
