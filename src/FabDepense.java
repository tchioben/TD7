package src;

import java.util.ArrayList;
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
	
	private HashMap<Integer,ArrayList<Depense>> dep;

	public FabDepense(){
		this.dep = new HashMap<Integer,ArrayList<Depense>>(); 
	}
	
	public static FabDepense getInstance(){
		if (INSTANCE == null){
			INSTANCE = new FabDepense();
		}
		return INSTANCE;
	}
	
	public ArrayList<Depense> getListeDepense(Integer idLigne){

		if (getListeDepense(idLigne)==null){
			this.dep.put(idLigne, new ArrayList<Depense>());
		}
		return dep.get(idLigne);
	}
	
	public void addDepense(float montant, Ligne line){
		if (getListeDepense(line.getId())==null){
			this.dep.put(line.getId(), new ArrayList<Depense>());
		}
		
		Depense depense = new Depense(line,montant);
		this.dep.get(line.getId()).add(depense)	;
	}
	
}
