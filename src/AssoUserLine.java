
public class AssoUserLine {

	public void addLine(String name,float montant,String commentaire){
		FabLigne fl = FabLigne.getInstance();
		FabUser fu = FabUser.getINSTANCE();
		User u = fu.addUser(name);
		Ligne li= fl.addLine(u, montant, commentaire);
		u.getListeLigne().add(li.getId());
	}
	
	
	
}
