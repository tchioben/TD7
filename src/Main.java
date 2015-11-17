package src;

public class Main {

	public static void main(String[] args) {
		AssoUserLine.addLine("benoit", new Float(15.50) , "commentaire");
		AssoUserLine.getLignes("benoit");
		System.out.println("test ok");
		AssoUserLine.imprimerLignes("benoit");
	}

}
