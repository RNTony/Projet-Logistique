import models.*;

public class Test {

	public static void main(String[] args) {
		Fournisseur f1 = new Fournisseur("Azert");
		System.out.println("f1:"+f1);
		Lot l1 = new Lot(f1);
		System.out.println("l1:"+l1);
	}

}
