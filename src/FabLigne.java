import java.util.ArrayList;
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
	
	private HashMap<Integer,ArrayList<Ligne>> lines;
	
	public Integer compteur;
	
	public FabLigne(){
		this.setLines(new HashMap<Integer,ArrayList<Ligne>>()); 
		this.compteur =1;
	}
	
	public static FabLigne getInstance(){
		if (INSTANCE == null){
			INSTANCE = new FabLigne();
		}
		return INSTANCE;
	}

	public Ligne addLine(User user, float montant,String commentaire){
		Ligne l = new Ligne(compteur++,user,montant,commentaire);
		this.lines.put(user.hashCode(), l);	
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
	 * @param lines the lines to set
	 */
	public void setLines(HashMap<Integer,Ligne> lines) {
		this.lines = lines;
	}
	
	
	
	
}
