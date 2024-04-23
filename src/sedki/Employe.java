package sedki;

public class Employe implements Comparable<Employe> {
	public int cin;
	public String nom;
	public float sal;
	public int dep;
	public Employe(int cin, String nom, float sal, int dep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.sal = sal;
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", nom=" + nom + ", sal=" + sal + ", dep=" + dep + "]";
	}


	@Override
	public int compareTo(Employe o) {
		return (int) (o.sal-this.sal);
	}
	
	
}
