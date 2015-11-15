/**
 * 
 */

/**
 * @author Tchioben
 *
 */
public class Depense {

	private float montant;
	
	private Ligne line;
	
	
	public Depense(Ligne line,float montant){
		this.setMontant(montant);
		this.setLine(line);
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
