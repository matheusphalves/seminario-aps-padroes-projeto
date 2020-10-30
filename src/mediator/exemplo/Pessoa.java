package mediator.exemplo;

import mediator.Colleague;
import mediator.ConcreteMediator;

public abstract class Pessoa {

	private String nome;
	private ChatSala mediator;

	public Pessoa(String nome, ChatSala mediator) {
		this.nome = nome;
		this.mediator = mediator;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ChatSala getMediator() {
		return mediator;
	}

	public void setMediator(ChatSala mediator) {
		this.mediator = mediator;
	}


	public void enviarMensagem(String mensagem, String nomePessoa) {
		this.getMediator().notify(this ,mensagem, nomePessoa);
	}
	
	public abstract void receberMensagem(String remetente,String cartinha);

}
