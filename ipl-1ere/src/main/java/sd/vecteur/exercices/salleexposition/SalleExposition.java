package sd.vecteur.exercices.salleexposition;

/**
 * @author 
 *
 */
public class SalleExposition {

	private Vecteur<Emplacement> emplacements;
	private Pile<Emplacement> emplacementsLiberes;
	
	/**
	 * construit une salle d'exposition vide (aucun emplacement)
	 */
	public SalleExposition(){

		this.emplacements = new VecteurImpl<>(0);
		this.emplacementsLiberes = new PileImpl<>();


	}
	
	/**
	 * renvoie le nombre d'emplacements 
	 * @return le nombre d'emplacements crees (libres ou occupes)
	 */
	public int nombreEmplacements(){
		return this.emplacements.taille() + this.emplacementsLiberes.taille();
	}

	/**
	 * renvoie le nombre d'oeuvres 
	 * @return le nombre d'oeuvres 
	 */
	public int nombreOeuvres(){
		return this.emplacements.taille();
	}

	/**
	 * ajoute une oeuvre dans la salle d'exposition
	 * (ajoute un emplacement si necessaire)
	 * precondition : l'oeuvre n'y est pas encore
	 * Votre methode ne doit pas faire cette verification!
	 * @param oeuvre l'oeuvre a ajouter
	 * @return le numero de l'oeuvre ajoutee
	 * @throws IllegalArgumentException si l'oeuvre est vide ou null
	 */
	public int ajouter(String oeuvre){
		Emplacement emplacementLibre = this.emplacementsLiberes.pop();
		emplacementLibre.setOeuvre(oeuvre);
		this.emplacements.ajoute(emplacementLibre);
		return emplacementLibre.getNumero();
	}

	
	/**
	 * renvoie l'oeuvre correspondante au numero passe en parametre
	 * @param numeroOeuvre le numero de l'oeuvre recherchee
	 * @return l'oeuvre ou null si le numeroOeuvre ne correspond a aucune oeuvre actuellement exposee 
	 */
	public String consulter(int numeroOeuvre){
		return this.emplacements.element(numeroOeuvre).getOeuvre();
	}


	/**
	 * supprime l'oeuvre correspondante au numero passe en parametre
	 * @param numeroOeuvre le numero de l'oeuvre a supprimer
	 * @return l'oeuvre supprimee ou null si le numeroOeuvre ne correspond a aucune oeuvre actuellement exposee 
	 */
	public String supprimer(int numeroOeuvre){
		Emplacement emplacement = this.emplacements.element(numeroOeuvre);
		this.emplacements.supprime(numeroOeuvre);
		String oeuvreSupprimée = emplacement.getOeuvre();
		emplacement.setOeuvre(null);
		this.emplacementsLiberes.push(emplacement);
		return oeuvreSupprimée;
		
	}
	
	/**
	 * renvoie un String avec les oeuvres existantes (pas les emplacements!)
	 * Les numeros et les oeuvres doivent apparaitre 
	 */
	public String donnerCatalogue(){	
		// TODO
		return null;
	}
}
