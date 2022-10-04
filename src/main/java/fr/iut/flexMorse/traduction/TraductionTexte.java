package fr.iut.flexMorse.traduction;

public class TraductionTexte {

    private String texteATraduire;
    private String texteTraduit;

    public TraductionTexte() {
    }

    public TraductionTexte(String texteATraduire, String texteTraduit) {
        this.texteATraduire = texteATraduire;
        this.texteTraduit = texteTraduit;
    }

    public String getTexteATraduire() {
        return texteATraduire;
    }

    public void setTexteATraduire(String texteATraduire) {
        this.texteATraduire = texteATraduire;
    }

    public String getTexteTraduit() {
        return texteTraduit;
    }

    public void setTexteTraduit(String texteTraduit) {
        this.texteTraduit = texteTraduit;
    }
}
