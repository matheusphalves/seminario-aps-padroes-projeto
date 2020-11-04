package mediator.exemplo;

public class PessoaNaoMembro extends Pessoa {

	public PessoaNaoMembro(String nome, MediatorInterface mediator) {
		super(nome, mediator);
	}

	@Override
	public void receberMensagem(String remetente, String cartinha) {
			
		if(remetente!=null)
			System.out.println(this.getNome() + " recebeu do membro: " + remetente + "\n" + cartinha);
		else 
			System.out.println(cartinha);
			
	}
	
}
