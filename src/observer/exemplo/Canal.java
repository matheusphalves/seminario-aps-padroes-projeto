package observer.exemplo;

import java.util.ArrayList;

import observer.ObserverInterface;
import observer.SubjectInterface;

public class Canal implements SubjectInterface {
	
	private String name;
	private String state;
	private ArrayList<ObserverInterface> subscribers;
	
	public Canal(String name) {
		this.name = name;
		this.subscribers = new ArrayList<ObserverInterface>();
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
        if(this.subscribers.contains(observer))
            this.subscribers.remove((Usuario) observer);

    }

	@Override
	public void notifyObserver() {
		for(ObserverInterface obs: this.subscribers) {
			obs.update(this);
		}	
	}
	
	public void sendVideo(String info) {
		this.state = info;	
		this.notifyObserver();
	}

}
