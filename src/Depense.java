package src;

public class Depense {

	private float montant;
	
	private Ligne line;
	
	
	public Depense(Ligne line,float montant){
		this.setMontant(montant);
		this.setLine(line);
		}
	
	public String toString(){
		String s ="";
		s += this.line.getId()+";"+this.line.getUser().toString()+";"+this.montant;		
		return s;
	}


	/**
	 * @return the line
	 */
	public Ligne getLine() {
		return line;
	}


	/**
	 * @param line the line to set
	 */
	public void setLine(Ligne line) {
		this.line = line;
	}


	/**
	 * @return the montant
	 */
	public float getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
}
