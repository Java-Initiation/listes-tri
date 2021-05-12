package tri;

public class Ville {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }

    // TRI PAR HABITANT
    /*
    @Override
    public int compareTo(Ville o) {
        return this.nbHabitants - o.nbHabitants;
    }
     */

    // TRI PAR NOM
    /*
    @Override
    public int compareTo(Ville o) {
        return this.nom.compareTo(o.getNom());
    }
     */

}
