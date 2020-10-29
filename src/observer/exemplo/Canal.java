package observer.exemplo;

import java.util.ArrayList;

import observer.Observer;
import observer.ObserverInterface;
import observer.SubjectInterface;

public class Canal implements SubjectInterface {
	
	private String name;
	private String state;
	private ArrayList<Usuario> subscribers;
	
	public Canal(String name) {
		this.name = name;
		this.subscribers = new ArrayList<Usuario>();
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
		this.subscribers.add((Usuario) observer);	
		
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		if(this.subscribers.size()>1)
			this.subscribers.remove((Usuario) observer);	
		
	}

	@Override
	public void notifyObserver() {
		for(Usuario obs: this.subscribers) {
			obs.update(this);
		}	
	}
	
	public void sendNote(String info) {
		this.state = info;	
		this.notifyObserver();
	}

}
