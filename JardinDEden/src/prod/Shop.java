package prod;

import flore.Vegetal;
import flore.legumes.Ail;
import flore.legumes.Betterave;
import flore.legumes.Carotte;
import flore.legumes.Tomate;

import java.util.HashMap;

public class Shop {
    private HashMap<Vegetal,Integer> produits;

    Shop()
    {
        this.produits = new HashMap<Vegetal,Integer>();
        this.produits.put(new Carotte(),5);
        this.produits.put(new Ail(),5);
        this.produits.put(new Tomate(),5);
        this.produits.put(new Betterave(),5);
    }

    public HashMap<Vegetal, Integer> getProduits() {
        return produits;
    }

    public void setProduits(HashMap<Vegetal, Integer> produits) {
        this.produits = produits;
    }
}
