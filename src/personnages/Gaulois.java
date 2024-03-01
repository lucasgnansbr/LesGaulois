package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int force;
	private int effetPotion = 1;

	public String getNom() {
		return nom;
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+texte);
	}
	private String prendreParole() {
		return "Le Gaulois"+nom+":";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
		}

	public static void main(String[]args) {
		Gaulois asterix=new Gaulois("asterix",8);
		System.out.println(asterix.getNom());
		
	}
}
