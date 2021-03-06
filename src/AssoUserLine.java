package src;

import java.util.ArrayList;

public class AssoUserLine {

	public static void addLine(String name,float montant,String commentaire){
		FabLigne fl = FabLigne.getInstance();
		FabUser fu = FabUser.getINSTANCE();
		User u = fu.addUser(name);
		Ligne li= fl.addLine(u, montant, commentaire);
		u.addLigne(li);
		System.out.println(li.getId());
	}
	
	public static ArrayList<Ligne> getLignes(String name){
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
	
	public static void imprimerLignes(String name){
		ArrayList<Ligne> liste = getLignes(name);
		for (Ligne ligne: liste){
			System.out.println(ligne.toString());
		}
	}
	
	public static String toStringLignes(String name){
		ArrayList<Ligne> liste = getLignes(name);
		String mot= "";
		for (Ligne ligne: liste){
			mot += ligne.toString()+"\n";
		}
		return mot;
	}
	
}
