package sedki;

public class Test {

	public static void main(String[] args) {
		Departement d1= new Departement(10);
		Employe e1=new Employe(1,"Mortadha",1500,10);
		Employe e2=new Employe(2,"Sedki",2500,10);
		Employe e3=new Employe(3,"Ahmed",1200,10);
		
		d1.ajoutEmploye(e1);
		d1.ajoutEmploye(e2);
		d1.ajoutEmploye(e3);
		d1.afficheDep();
		System.out.println(d1.existeE(2));
		System.out.println("Max Salaire: "+d1.getEmpSalMax());

	}

}
