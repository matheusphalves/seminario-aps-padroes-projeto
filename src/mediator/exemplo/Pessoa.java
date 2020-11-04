package mediator.exemplo;

public abstract class Pessoa  {

	private String nome;
	private MediatorInterface mediator;

	public Pessoa(String nome, MediatorInterface mediator) {
		this.nome = nome;
		this.mediator = mediator;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public MediatorInterface getMediator() {
		return mediator;
	}

	public void setMediator(MediatorInterface mediator) {
		this.mediator = mediator;
	}
	
	public void enviarMensagem(String mensagem, String nomePessoa) {
		this.getMediator().notify(this ,mensagem, nomePessoa);
	}
	
	public abstract void receberMensagem(String remetente,String cartinha);

}
