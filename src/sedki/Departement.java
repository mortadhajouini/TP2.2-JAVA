package sedki;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employe> LEmployes;
	

public Departement(int idDep) {
		super();
		this.idDep = idDep;
		this.LEmployes= new HashSet <>();
	}



public int getIdDep() {
	return idDep;
}



public void setIdDep(int idDep) {
	this.idDep = idDep;
}



public void ajoutEmploye(Employe E)
{
 LEmployes.add(E);
}

public void retirerEmploye(Employe E)
{
LEmployes.remove(E);
}



public void afficheDep()
{
	System.out.println(this.idDep);
	for(Employe E: LEmployes) {
		System.out.println(E);
	}
}

public boolean existeE(int cin)
{
	boolean x=false;
	for(Employe E: LEmployes) {
		if (E.cin==cin) {
			x=true;
		}
	}
	return x;
}
//retourner l'employé qui a le plus grand salaire ds le département
//pensez un utiliser un treeSet
public Employe getEmpSalMax()
{
	
	TreeSet<Employe> set= new TreeSet<>(this.LEmployes);
	return set.first();

}
}