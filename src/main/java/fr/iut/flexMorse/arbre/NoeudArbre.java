package fr.iut.flexMorse.arbre;

public class NoeudArbre {
    private String lettre;
    private NoeudArbre previous;
    private NoeudArbre gauchePoint;
    private NoeudArbre droiteTiret;

    /**
     * Ce constructeur est vide car le seul moyen pour initialiser ses attribut sera de passer par la méthode add()
     */
    public NoeudArbre() {
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public NoeudArbre getPrevious() {
        return previous;
    }

    public void setPrevious(NoeudArbre previous) {
        this.previous = previous;
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

    // Methods
    public NoeudArbre getFirstNoeud() {
        if (getPrevious() == null)
            return this;
        else return getPrevious().getFirstNoeud();
    }

    public void add(String lettre, String codeMorse) {
        NoeudArbre noeud = this.getFirstNoeud();
        // On boucle sur la chaine de caractere mais on s'arrête avant son dernier indice car celui-ci définira la lettre que contient le noeud
        for (int i = 0; i < codeMorse.length() - 1; i++) {
            String character = String.valueOf(codeMorse.charAt(i));
            noeud = switchAndGenerate(noeud, character);
        }
        // On s'occupe ici du dernier noeud auquel on va attribuer la lettre
        String lastCharacter = String.valueOf(codeMorse.charAt(codeMorse.length()-1));
        noeud = switchAndGenerate(noeud, lastCharacter);
        noeud.setLettre(lettre);
    }

    public String getLettreByCode(String codeMorse) {
        NoeudArbre noeud = this.getFirstNoeud();

        for (int i = 0; i < codeMorse.length(); i++) {
            String character = String.valueOf(codeMorse.charAt(i));
            noeud = switchBranchAndGetNoeud(noeud, character);
        }
        return noeud.getLettre();
    }

    private NoeudArbre switchAndGenerate(NoeudArbre noeud, String characterToSwitch) {
        switch (characterToSwitch) {
            case "." -> {
                if (noeud.getGauchePoint() == null) {
                    noeud.setGauchePoint(new NoeudArbre());
                    noeud.getGauchePoint().setPrevious(noeud);
                }
                return noeud.getGauchePoint();

            }
            case "-" -> {
                if (noeud.getDroiteTiret() == null) {
                    noeud.setDroiteTiret(new NoeudArbre());
                    noeud.getDroiteTiret().setPrevious(noeud);
                }
                return noeud.getDroiteTiret();
            }
            default ->
                    throw new IllegalArgumentException("Erreur, le code morse contient : " + characterToSwitch + " ce qui n'est pas un caractere valide");
        }
    }

    private NoeudArbre switchBranchAndGetNoeud(NoeudArbre noeud, String characterToSwitch) {
        switch (characterToSwitch) {
            case "." -> {
                return noeud.getGauchePoint();
            }
            case "-" -> {
                return noeud.getDroiteTiret();
            }
            default ->
                    throw new IllegalArgumentException("Erreur, le code morse contient : " + characterToSwitch + " ce qui n'est pas un caractere valide");
        }
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
