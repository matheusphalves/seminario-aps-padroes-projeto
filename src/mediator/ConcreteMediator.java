package mediator;

import java.util.ArrayList;

public class ConcreteMediator implements MediatorInterface {
	private ArrayList<Colleague> colleagues;
	
	public ConcreteMediator() {
		this.colleagues = new ArrayList<>();
	}
	
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
	}

	@Override
	public void notify(Colleague sender) {
		int index = this.colleagues.indexOf(sender); //identifica se colleague pertence ao mediador
		if(index!=-1)
			System.out.println("Alguma coisa...");
	}
}
