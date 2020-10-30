package mediator.exemplo;

import java.util.ArrayList;

import mediator.Colleague;
import mediator.MediatorInterface;

public class ChatSala implements MediatorInterface {

	private ArrayList<Pessoa> participantes;
	
	public ChatSala() {
		this.participantes = new ArrayList<Pessoa>();
	}
	
	public void adicionarParticipante(Pessoa pessoa) {
		this.participantes.add(pessoa);
	}
	
	public ArrayList<Pessoa> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Pessoa> participantes) {
		this.participantes = participantes;
	}

	@Override
	public void notify(Object remetente,String mensagem, String destinatario) {
		Pessoa dest =  this.buscarParticipante(destinatario);
		Pessoa origin = (Pessoa) remetente;
		
		if(this.validar(origin, dest)) {
			dest.receberMensagem(origin.getNome(), mensagem);
		}else {
			origin.receberMensagem(null, "Marrapais, pode não!");
		}
	}
	
	public Pessoa buscarParticipante(String destinatario) {
		for(Pessoa pessoa: this.participantes) {
			if(pessoa.getNome().equals(destinatario))
				return pessoa;
		}	
		return null;
	}

	public boolean validar(Pessoa pessoa1, Pessoa pessoa2) {
		boolean result = false;
		
		if(pessoa2!=null) {
			if(pessoa1 instanceof PessoaMembro && pessoa2 instanceof PessoaNaoMembro) {
				result = true;
			}else if(pessoa1 instanceof PessoaNaoMembro && pessoa2 instanceof PessoaMembro) {
				result = true;
			}
		}
		return result;
	}
	
}
