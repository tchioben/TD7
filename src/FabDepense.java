import java.util.HashMap;

/**
 * 
 */

/**
 * @author Tchioben
 *
 */
public class FabDepense {
	private static FabDepense INSTANCE = null;
	
	private HashMap<Integer,Depense> dep;

	public FabDepense(){
		this.dep = new HashMap<Integer,Depense>(); 
	}
	
	public static FabDepense getInstance(){
		if (INSTANCE == null){
			INSTANCE = new FabDepense();
		}
		return INSTANCE;
	}
	
	public void addDepense(float montant, Ligne line){
		Depense dep = new Depense(line,montant);
		this.dep.put(line.getId(), dep);
	}
	
}
