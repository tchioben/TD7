package src;

public class Ligne {

	private User user;
	
	private Integer id;
	
	private Float montant;
	
	private String commentaire;

	public Ligne(Integer id,User user, Float montant,String commentaire){
		this.id=id;
		this.user=user;
		this.montant=montant;
		this.setCommentaire(commentaire);
	}
	
	
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the montant
	 */
	public Float getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Float montant) {
		this.montant = montant;
	}



	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}



	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
}
