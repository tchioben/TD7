import java.util.ArrayList;


public class User {

	private String nom;
	
	private ArrayList<Integer> listeLigne;
	
	public User(String nom){
		this.setNom(nom);
		this.listeLigne = new ArrayList<Integer>();
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean equals(Object o){
		return this.nom.equals(((User) o).getNom());
	}
	
	public int hashCode(){
		return this.nom.hashCode();
	}

	/**
	 * @return the listeLigne
	 */
	public ArrayList<Integer> getListeLigne() {
		return listeLigne;
	}

	/**
	 * @param listeLigne the listeLigne to set
	 */
	public void setListeLigne(ArrayList<Integer> listeLigne) {
		this.listeLigne = listeLigne;
	}
	
}
