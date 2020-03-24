package flore;

public abstract class Vegetal {

    private char[] dessin;
    private Etat etat;
    private String nom;

    public Vegetal()
    {
        setDessin(new char[]{'_', '.', 'i', ' ', ' ', '#'});
        setEtat(Etat.GRAINE);
    }

    public char[] getDessin() {
        return dessin;
    }

    public void setDessin(char[] dessin) {
        this.dessin = dessin;
    }

    public void setElementOfDessin(char charatere,int indexe)
    {
        this.dessin[indexe] = charatere;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
