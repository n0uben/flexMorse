package fr.iut.flexMorse.liste;

public class NoeudListe {

    private NoeudListe previous;
    private String lettre;
    private String morse;
    private NoeudListe next;

    public NoeudListe() {
    }

    public NoeudListe(String lettre, String morse) {
        this.lettre = lettre;
        this.morse = morse;
    }

    public NoeudListe(NoeudListe previous, String lettre, String morse, NoeudListe next) {
        this.previous = previous;
        this.lettre = lettre;
        this.morse = morse;
        this.next = next;
    }

    public String getLettre() {
        if (lettre == null) {
            return "";
        } else {
            return lettre;
        }
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

    public NoeudListe getNext() {
        return next;
    }

    public void setNext(NoeudListe next) {
        this.next = next;
    }

    public NoeudListe getPrevious() { return previous; }

    public void setPrevious(NoeudListe previous) { this.previous = previous; }

    public NoeudListe getLastNoeud() {
        if (getNext() == null)
            return this;
        else return getNext().getLastNoeud();
    }

    public NoeudListe getFirstNoeud() {
        if (getPrevious() == null)
            return this;
        else return getPrevious().getFirstNoeud();
    }

    public void add(String lettre, String morse) {
        if (this.getLettre().equals("")) {
            setLettre(lettre);
            setMorse(morse);
        }
        else {
            NoeudListe lastNoeud = getLastNoeud();
            lastNoeud.setNext(new NoeudListe(lettre, morse));
            lastNoeud.getNext().setPrevious(lastNoeud);
        }
    }

    public void delete() {
        getLastNoeud().getPrevious().setNext(null);
    }

    public NoeudListe getNoeudBy(String lettre) {
        NoeudListe noeud = getFirstNoeud();
        while (noeud != null && !noeud.getLettre().equals(lettre)) {
            noeud = noeud.getNext();
        }
        return noeud;
    }

    public NoeudListe getNoeudBy(int index) {
        if (index < 0 || index > getSize())
            throw new IndexOutOfBoundsException("Error, this index is out of liste");

        NoeudListe noeud = getFirstNoeud();
        for (int i = 0; i < index; i++) {
            noeud = noeud.getNext();
        }
        return noeud;
    }

    public int getIndexOf(String lettre) {
        NoeudListe noeud = getFirstNoeud();
        int count = 0;

        while (noeud != null && !noeud.getLettre().equals(lettre)) {
            noeud = noeud.getNext();
            count += 1;
        }
        return count;
    }

    public int getIndexOf(NoeudListe noeudToSearch) {
        NoeudListe noeud = getFirstNoeud();
        int count = 0;

        while (noeud != null && noeud != noeudToSearch) {
            noeud = noeud.getNext();
            count += 1;
        }
        return count;
    }

    public void insertAt(int index, String lettre, String morse) {
        if (index < 0 || index > getSize())
            throw new IndexOutOfBoundsException("Error, this index is out of liste");

        NoeudListe noeud = getNoeudBy(index);
        noeud.getPrevious().setNext(new NoeudListe(noeud.getPrevious(), lettre, morse, noeud));
    }

    public int getSize() {
        return getIndexOf(getLastNoeud()) + 1;
    }


    @Override
    public String toString() {
        return "NoeudListe{" +
                "lettre='" + lettre + '\'' +
                ", morse='" + morse + '\'' +
                ", suivant=" + next +
                '}';
    }
}
