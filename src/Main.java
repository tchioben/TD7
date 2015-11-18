package src;

public class Main {

	public static void main(String[] args) {
		System.out.println("test ok");
		AssoUserLine.addLine("benoit", new Float(15.50) , "commentaire");
		AssoDepenseLine.addDepense(1, new Float(20.00));
		AssoUserLine.getLignes("benoit");
		System.out.println("test ok");
		AssoUserLine.imprimerLignes("benoit");
	}

}
