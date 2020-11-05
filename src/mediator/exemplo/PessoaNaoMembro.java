package mediator.exemplo;

public class PessoaNaoMembro extends Pessoa {

	public PessoaNaoMembro(String nome, MediatorInterface mediator) {
		super(nome, mediator);
	}

	@Override
	public void receberMensagem(String remetente, String cartinha) {
			
		if(remetente!=null)
			System.out.println("> " + this.getNome() + " recebeu do membro: " + remetente + "\n" + cartinha + "\n");
		else 
			System.out.println("> "+ this.getNome() + ": Não membros não podem trocar mensagens entre si\n" + cartinha);
			
	}
	
}
