package tp_1;

class Livre {
private String titre, auteur;
private float nbPages;
	public Livre (String  auteur,String titre) {
	this.auteur = auteur;
	this.titre = titre;
	}
	public Livre ()
	{
		this.nbPages=0;
	}
	public Livre (float nbPages,String titre) {
		this.nbPages = nbPages;
		this.titre = titre;
		}
	public Livre (float nbPages,String titre,String auteur) {
		this.nbPages = nbPages;
		this.titre = titre;
		this.auteur=auteur;
		}
	public String getAuteur() {
	return auteur;
	}
	public void setNbPages (float nb) {
		if (nb>20)
		{
			this.nbPages = nb;
		}
		else
			System.out.println("le nombre indiqué est faible.");
		this.nbPages = nb;
}
	public String getTitre()
	{
		return this.titre;
	}
	public float getnbP()
	{
		return this.nbPages;
	}
	public void setAuteur(String ch)
	{
		this.auteur=ch;
	}
	public void setTitre(String ch)
	{
		this.titre=ch;
	}
	public String toString() {
	    return ("Livre intitulé : " + this.titre + " contenant " + this.nbPages + " pages.\n");
	}
	public void decrire()
	{
		System.out.print(this.toString());
	}

	
}

