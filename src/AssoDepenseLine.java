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
		Ligne  ligne = fl.getLine(idLigne);
		ligne.getMontant();
		sommeDepense(idLigne);
		//if (ligne.getMontant()-(sommeDepense(idLigne)+montantDepense)>=0){
		//	FabDepense fd = FabDepense.getInstance();
		//	fd.addDepense(montantDepense, fl.getLine(idLigne));
	//	}
		//else {System.out.println("pas assez d'argent sur le compte");}
	}
	
	public static ArrayList<Depense> getDepenses(Integer idLigne){
		FabDepense fb = FabDepense.getInstance();
		ArrayList<Depense> lDepense = fb.getListeDepense(idLigne);
		return lDepense;
	}
	
	
	public static void toStringDepenses(Integer idLigne){
		ArrayList<Depense> dep = getDepenses(idLigne);
		for ( Depense d : dep){
			d.toString();
		}
	}
	
	public static float sommeDepense(Integer idLigne){
		float somme= 0;
		ArrayList<Depense> depences = getDepenses(idLigne);
		for ( Depense d : depences){
			System.out.println(d.toString());
			somme += d.getMontant();
		}
		return somme;
	}
	
	
}
