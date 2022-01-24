package br.com.cod3r.observer.party.after.subject;

public class Doorman extends Subjetc{
	
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		if(newStatus != status) {
			this.status = newStatus;
			notifyObservers(newStatus);
		}
	}
}
