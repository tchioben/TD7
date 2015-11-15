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
	
	public boolean existe(User u){
		return this.users.containsValue(u);
	}
	
	public User addUser(String name){
		User u0;
		if (!existe(new User(name))){
			u0 = new User(name);
			this.users.put(u0.hashCode(), u0);
		}
		else {u0 = this.users.get((new User(name)).hashCode());}
		return u0;
	}
	
	public User getUser(String name){
		User u0= new User(name);
		return this.users.get(u0.hashCode());
	}
}
