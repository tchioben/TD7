package src;

import java.util.HashMap;

/**
 * 
 */

/**
 * @author Tchioben
 *
 */
public class FabLigne {

	private static FabLigne INSTANCE = null;
	
	private HashMap<Integer,Ligne> lines;
	
	public Integer compteur;
	
	public FabLigne(){
		this.setLines(new HashMap<Integer,Ligne>()); 
		this.compteur =1;
	}
	
	public static FabLigne getInstance(){
		if (INSTANCE == null){
			INSTANCE = new FabLigne();
		}
		return INSTANCE;
	}

	public Ligne addLine(User user, float montant,String commentaire){
		Ligne l = new Ligne(compteur,user,montant,commentaire);
		this.lines.put(compteur++, l);	
		return l;
	}
	
	public Ligne getLine(Integer nb){
		return this.lines.get(nb);
	}
	
	
	/**
	 * @return the lines
	 */
	public HashMap<Integer,Ligne> getLines() {
		return lines;
	}

	/**
	 * @param hashMap the lines to set
	 */
	public void setLines(HashMap<Integer, Ligne> hashMap) {
		this.lines = hashMap;
	}
	
	
	
	
}
