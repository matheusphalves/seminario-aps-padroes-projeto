package observer;


import java.util.ArrayList;

public class Subject implements SubjectInterface {

	private String name;
	private String state;
	private ArrayList<Observer> observers;
	
	

	public Subject(String name) {
		this.name = name;
		this.observers = new ArrayList<Observer>();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	@Override
	public void addObserver(ObserverInterface observer) {
		this.observers.add((Observer) observer);	
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		if(this.observers.size()>1)
			this.observers.remove(observer);	
	}

	
	
	@Override
	public void notifyObserver() {
		for(Observer obs: this.observers) {
			obs.update(this);
		}
	}
	
	
	public void sendNote(String info) {
		this.state = info;	
		this.notifyObserver();
	}
	

}
