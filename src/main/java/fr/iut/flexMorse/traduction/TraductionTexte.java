package fr.iut.flexMorse.traduction;

public class TraductionTexte {

    private String texte;

    public TraductionTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    public String toString() {
        return "TraductionTexte{" +
                "texte='" + texte + '\'' +
                '}';
    }
}
