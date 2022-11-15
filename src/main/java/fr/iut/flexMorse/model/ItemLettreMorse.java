package fr.iut.flexMorse.model;

public class ItemLettreMorse {
    private String lettre;
    private String morse;

    public ItemLettreMorse() {
    }
    public ItemLettreMorse(String lettre, String morse) {
        this.setLettre(lettre);
        this.setMorse(morse);
    }

    public String getLettre() {
        if (lettre == null) {
            return "";
        } else {
            return lettre;
        }
    }

    public String getMorse() {
        if (morse == null) {
            return "";
        } else {
            return morse;
        }
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }
}
