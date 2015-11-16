package src;

import java.util.HashMap;


public class FabUser {

	private HashMap<Integer,User> users;
	
	private static FabUser INSTANCE = null;
		
	
	static public FabUser getINSTANCE() {
		if (INSTANCE == null){
			INSTANCE = new FabUser();
		}
		return INSTANCE;
	}
	
	public FabUser(){
		this.users = new HashMap<Integer, User>();
	}
	
	public boolean existe(User u){
		return this.users.containsValue(u);
	}
	
	public boolean nameExiste(String name){
		if (this.users.containsKey(name.hashCode())) {
			return true;
		}
		else { return false;}
	}
	
	public User addUser(String name){
		User u0;
		if (!nameExiste(name)){
			u0 = new User(name);
			this.users.put(u0.hashCode(), u0);
		}
		else {u0 = this.users.get(name.hashCode());}
		return u0;
	}
	
	public User getUser(String name){
		User u0= this.addUser(name);
		return this.users.get(u0.hashCode());
	}
}
