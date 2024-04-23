package sedki;

import java.util.HashMap;
import java.util.Set;

public class Entreprise {
private String nomEntreprise;
HashMap<Integer, Departement> Liste_Deps;

public String getNomEntreprise() {
	return nomEntreprise;
}
public void setNomEntreprise(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
}


public Entreprise(String nomEntreprise) {
	super();
	this.nomEntreprise = nomEntreprise;
	Liste_Deps= new HashMap<>();
}


public void ajoutDep(Departement d)
{
Liste_Deps.put(d.getIdDep(),d);
}
public void retirerDep(Departement d)
{
Liste_Deps.remove(d.getIdDep());
}
public void afficheE()
{
	System.out.println(this.nomEntreprise);
	Set<Integer> s=this.Liste_Deps.keySet();
	for(int i : s) {
		System.out.println(i +""+ this.Liste_Deps.get(i));
	}
}
// transfert d'un employé d'un département à l'autre
public void UpdateDep(Employe E, int idDep)
{
	Set<Integer> s=this.Liste_Deps.keySet();
	for(int i :s) {
		if (Liste_Deps.get(i).existeE(E.cin)) {
			Liste_Deps.get(i).retirerEmploye(E);
			Liste_Deps.get(idDep).ajoutEmploye(E);
		}
	}
	}
	//vérifier si un département donné en paramètre appartient à la société ou pas
	public boolean existeD(Departement d)
	{
		return Liste_Deps.containsKey(d.getIdDep());
	}
	//afficher le département ayant le plus petit nombre d’étudiants 
	public void DepMinCapacity()
	{
	 //à compléter
}
}