package observer;

public interface SubjectInterface {
	
	public void addObserver(ObserverInterface observer);
	public void removeObserver(ObserverInterface observer);
	public void notifyObserver();
}
