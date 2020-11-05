package mediator.exemplo;

public class Main {
	
	public static void main(String[] args) {
		//CHAT MEDIADOR
		ChatSala chat = new ChatSala();
		
		//PESSOAS QUE INTERAGEM COM O MEDIADOR
		PessoaMembro nilton = new PessoaMembro("Nilton", chat);
		PessoaNaoMembro richard = new PessoaNaoMembro("Richard", chat);
		PessoaMembro birilo = new PessoaMembro("Birilo", chat);
		
		//MEDIADOR ADICIONA PARTICIPANTES
		chat.adicionarParticipante(nilton);
		chat.adicionarParticipante(richard);
		chat.adicionarParticipante(birilo);
		
		//ENVIO DE MENSAGENS
		richard.enviarMensagem("Voc� pode me ajudar com esta atividade?", "Birilo"); // n�o membro -> membro
		birilo.enviarMensagem("Eu tamb�m n�o entendi...", "Richard"); // membro -> n�o membro
		nilton.enviarMensagem("Birilo", "tururu"); // membro -> membro
	}

}
