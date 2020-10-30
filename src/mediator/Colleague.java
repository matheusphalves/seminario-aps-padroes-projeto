package mediator;

public abstract class Colleague {
	
	private ConcreteMediator mediator;
	
	public Colleague(ConcreteMediator mediator) {
		this.mediator = mediator;
		this.mediator.addColleague(this);
	}

	public ConcreteMediator getMediator() {
		return mediator;
	}

	public void setMediator(ConcreteMediator mediator) {
		this.mediator = mediator;
	}
	

	//ADICIONAR OPERAÇÕES
	
}
