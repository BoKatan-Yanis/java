package prod;


import flore.Vegetal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Jardin {
    private int longueur;
    private int largeur;
    private HashMap<Vegetal, Integer> panier;
    private ArrayList<Emplacement> emplacement;
    private Shop shop;


    Jardin(int pLongueur, int pLargeur) {
        this.largeur = pLargeur;
        this.longueur = pLongueur;
        this.panier = new HashMap<Vegetal, Integer>();
        this.shop = new Shop();

        this.shop.getProduits().forEach((l, i) -> {
            setInPanier(l, 3);
        });
    }

    public String getPanier() {
        if (this.panier.isEmpty()) {
            return "Panier Vide";
        }
        return panier.toString();
    }

    public void setInPanier(Vegetal nomDuVegetal, int quantite) {
        this.panier.put(nomDuVegetal, quantite);
    }

    public String Carte() {
        StringBuilder carte = new StringBuilder();
        for (int i = 0; i < this.longueur; i++) {

            if (i == 0) {
                //   carte.append("⧦".repeat((int) Math.max(0, this.largeur * .77))).append("\n");
            }
            //carte.append('⧦');

            for (int j = 0; j < this.largeur; j++) {

                carte.append("o");
            }
            //carte.append('⧦');
            carte.append("\n");

        }

        //carte.append("⧦".repeat((int) Math.max(0, this.largeur * .77))).append("\n");
        return carte.toString();
    }

    public void addVegetal(Emplacement emplacement) {
        this.emplacement.add(emplacement);
    }


    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String Semer(String coordonee, String legume) {
        String[] cooArr = coordonee.split(",");
        Coordonee coo;
        Vegetal leg;

        if (cooArr.length == 2) {
            coo = new Coordonee(Integer.parseInt(cooArr[0]), Integer.parseInt(cooArr[1]));


            if (!legume.isEmpty()) {
                System.out.println(legume);
                for (Map.Entry<Vegetal, Integer> item : panier.entrySet()) {
                    Vegetal l = (item.getKey());
                    Integer i = item.getValue();

                    if (l.getNom().toLowerCase().equals(legume.toLowerCase())) {
                        leg = l;
                        Emplacement emp = new Emplacement(leg, coo);
                        addVegetal(emp);
                        return getEmplacement().toString();
                    }else{
                        return "err";
                    }
                }

            } else {
                return "Entrez un legume";
            }
        } else {
            return "Entrez des coordonées valide";
        }
        return getEmplacement().toString();
    }

    public ArrayList<Emplacement> getEmplacement() {
        return emplacement;
    }

}
