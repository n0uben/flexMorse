package fr.iut.flexMorse.liste;

public class NoeudListe {


    private String lettre;
    private String morse;
    private NoeudListe suivant;

    public NoeudListe() {
    }

    public NoeudListe(NoeudListe precedent, String lettre, String morse, NoeudListe suivant) {

        this.lettre = lettre;
        this.morse = morse;
        this.suivant = suivant;
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }

    public NoeudListe getSuivant() {
        return suivant;
    }

    public void setSuivant(NoeudListe suivant) {
        this.suivant = suivant;
    }

    @Override
    public String toString() {
        return "NoeudListe{" +
                ", lettre='" + lettre + '\'' +
                ", morse='" + morse + '\'' +
                ", suivant=" + suivant +
                '}';
    }
}
