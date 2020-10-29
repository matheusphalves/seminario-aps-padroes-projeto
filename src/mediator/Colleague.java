package mediator;

public abstract class Colleague {
	
	private ConcreteMediator mediator;
	
	public Colleague(ConcreteMediator mediator) {
		this.mediator = mediator;
		this.mediator.addColleague(this);
	}

	//ADICIONAR OPERAÇÕES
	
}
