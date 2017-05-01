import models.*;

public class Test {

	public static void main(String[] args) {
		Fournisseur f1 = new Fournisseur("Azert");
		System.out.println("f1:"+f1);
		Lot l1 = new Lot(f1);
		//System.out.println("l1:"+l1);
		Livraison ll1 = new Livraison(2.50f,2.00f,l1);
		Livraison ll2 = new Livraison(4.50f,8.00f,l1);
		//System.out.println("ll1:"+ll1);
		Aliment a1 = new Aliment("carotte", ll1);
		Aliment a2 = new Aliment("mangue", ll2);
		//System.out.println("a1 : "+a1 + "a2 : "+a2);
		DetailPlat d1 = new DetailPlat(a1,1.50f);
		System.out.println("d1 : "+d1);
		DetailPlat d2 = new DetailPlat(a2,1.50f);
		System.out.println("d2 : "+d2);
		Plat p1 = new Plat(15.0f,"Carotte à la mangue", null);
	}
}