package observer;

import java.util.ArrayList;

public class Observer implements ObserverInterface {
	private String userName;
	private ArrayList<Subject> subjects;
	
	
	public Observer(String userName) {
		this.userName = userName;
		this.subjects = new ArrayList<Subject>();
	}
	
	public void subscribe(Subject context) {
		if(!this.subjects.contains(context)) {
			context.addObserver(this);
			this.subjects.add(context);
		}
	}
	
	@Override
	public void update(SubjectInterface context) {
		if(this.subjects.contains(context))
			System.out.println(context);
	}
	
	
	@Override
	public String toString() {
		return this.userName;
	}

}
