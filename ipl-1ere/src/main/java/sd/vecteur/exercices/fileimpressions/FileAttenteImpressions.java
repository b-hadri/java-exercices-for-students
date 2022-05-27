package sd.vecteur.exercices.fileimpressions;

public class  FileAttenteImpressions{

	// Une file avec les demandes d'impression
	private File<DemandeImpression> fileDemandesImpression;
	
	/**
	 * construit une file vide
	 */
	public FileAttenteImpressions() {
		fileDemandesImpression = new FileImplViaTable<DemandeImpression>();
	}
	
	/**
	 * verifie si la file est vide
	 * @return true si la file est vide, false sinon
	 */
	public boolean estVide(){
		return false;
		// TODO
	}
	
	/**
	 * ajoute la demande d impression en fin de file
	 * @param demande la demande a ajouter
	 * @throws IllegalArgumentException si la demande est null
	 */
	public void ajouter(DemandeImpression demande){
		// TODO
	}
	
	/**
	 * retire l'impression en tete de file
	 * @return l'impression qui a ete retiree
	 * @throws FileVideException si aucune demande d impression dans la file
	 */
	public DemandeImpression retirer()throws FileVideException{
		return null;
		// TODO
	}

	
	
	
}
