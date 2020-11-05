package mediator.exemplo;

public class PessoaMembro extends Pessoa {

	public PessoaMembro(String nome, MediatorInterface mediator) {
		super(nome, mediator);
	}

	@Override
	public void receberMensagem(String remetente, String cartinha) {
		if(remetente!=null)
			System.out.println("> " + this.getNome() + " recebeu do não membro: " + remetente + "\n" + cartinha + "\n");
		else
			System.out.println("> "+ this.getNome() + ": Membros não podem trocar mensagens entre si\n" + cartinha);
		
	}

}
