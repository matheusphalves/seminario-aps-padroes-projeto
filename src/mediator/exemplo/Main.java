package mediator.exemplo;

public class Main {
	
	public static void main(String[] args) {
		ChatSala chat = new ChatSala();
		
		
		PessoaMembro nirton = new PessoaMembro("nirton", chat);
		PessoaNaoMembro richard = new PessoaNaoMembro("richard", chat);
		PessoaMembro biriloVip = new PessoaMembro("birilo", chat);
		
		chat.adicionarParticipante(nirton);
		chat.adicionarParticipante(richard);
		chat.adicionarParticipante(biriloVip);
		
		
		richard.enviarMensagem("Minha cocada", "birilo");
	}

}
