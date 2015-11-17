package src;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Tchioben
 *
 */
public class AssoDepenseLine {
	
	public static void addDepense(Integer idLigne, float montantDepense){
		FabLigne fl = FabLigne.getInstance();
		FabDepense fd = FabDepense.getInstance();
		fd.addDepense(montantDepense, fl.getLine(idLigne));
	}
	
	public static ArrayList<Depense> getLignes(String name){
		FabLigne fl = FabLigne.getInstance();
		FabUser fu = FabUser.getINSTANCE();
		User u = fu.getUser(name);
		ArrayList<Integer> lInt = u.getListeLigne();
		ArrayList<Ligne> lLigne= new ArrayList<Ligne>();
		for (Integer n: lInt){
			lLigne.add(fl.getLine(n));
		}
		return lLigne;
	}
	
	
	public static void toStringDepenses(Integer idLigne){
		FabDepense fd = FabDepense.getInstance();
		ArrayList<Depense> dep = fd.getDepenses(idLigne);
		
	}
	
	
}
