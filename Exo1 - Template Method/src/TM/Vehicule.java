package TM;

public abstract class Vehicule {
	
	public void Se_deplacer() {	
		Demarrer();
			Marcher();
			Tourner();
	}
	
	protected abstract boolean Demarrer();
	
	protected abstract void Marcher();
	
	protected abstract void Tourner();
	
	

}
