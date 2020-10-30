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
	public void notify(Object sender, String mensagem, String data) {
		// TODO Auto-generated method stub
		
	}


}
