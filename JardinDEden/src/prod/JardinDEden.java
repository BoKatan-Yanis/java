package prod;

import flore.Vegetal;

import java.io.InputStream;
import java.util.Scanner;

public class JardinDEden {

    public static void main(String[] args) {

        Jardin jardin = new Jardin(5,10);

        Scanner sc =  new Scanner(System.in);
        System.out.println("Votre Jardin Magique : \n" + jardin.Carte() + "\n" + jardin.getPanier() + "\n\n" + " 1. Semer une graine ; \n 2. Récolter toutes les plantes qui sont matures ; \n 3. Passer à la saison suivante (toutes les plantes grandissent) ; \n 4. Quitter l’application. \n");
        String str = sc.nextLine();
        switch (str.toLowerCase()) {

            case "1":
            case "semer":
            case "semer une graine":
                System.out.println("semer une graine \n Coordonnée ex: 1,5");
                String coo = sc.nextLine();
                System.out.println("Votre legume  : ");
                String legume = sc.nextLine();
                System.out.println(jardin.Semer(coo,legume));
                break;
            case "2":
            case "recolter":
            case "récolter toutes les plantes qui sont matures":
                System.out.println("récolter toutes les plantes qui sont matures \n Etes-vous sur ? oui/non");
                break;
            case "3":
            case "passer":
            case "passer à la saison suivante (toutes les plantes grandissent)":
                System.out.println("Passer à la saison suivante (toutes les plantes grandissent) \n Etes-vous sur ? oui/non");
                break ;
            case "4" :
            case "exit" :
                System.exit('0');
                break;

        }
    }


}
