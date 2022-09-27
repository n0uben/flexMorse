package fr.iut.flexMorse.arbre;

public class NoeudArbre {

    private String lettre;

    private NoeudArbre gauchePoint;
    private NoeudArbre droiteTiret;

    public NoeudArbre() {
    }

    public NoeudArbre(String lettre, NoeudArbre gauchePoint, NoeudArbre droiteTiret) {
        this.lettre = lettre;
        this.gauchePoint = gauchePoint;
        this.droiteTiret = droiteTiret;
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public NoeudArbre getGauchePoint() {
        return gauchePoint;
    }

    public void setGauchePoint(NoeudArbre gauchePoint) {
        this.gauchePoint = gauchePoint;
    }

    public NoeudArbre getDroiteTiret() {
        return droiteTiret;
    }

    public void setDroiteTiret(NoeudArbre droiteTiret) {
        this.droiteTiret = droiteTiret;
    }

    @Override
    public String toString() {
        return "NoeudArbre{" +
                "lettre='" + lettre + '\'' +
                ", gauchePoint=" + gauchePoint +
                ", droiteTiret=" + droiteTiret +
                '}';
    }
}
