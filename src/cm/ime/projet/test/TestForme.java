package cm.ime.projet.test;

import cm.ime.projet.api.Carre;
import cm.ime.projet.api.Cercle;
import cm.ime.projet.api.Forme;
import cm.ime.projet.api.Rectangle;

public class TestForme {

    static Forme rect, carr, cerc;

    public static void main(String[] args){

        //Instanciation du rectangle
        rect= new Rectangle(15,10);

        //Instanciation du carré
        carr= new Carre(5);

        //Instanction du cercle
        cerc= new Cercle(10);

        //affichages
        System.out.println("Affichage des formes");
        rect.affiche();
        carr.affiche();
        cerc.affiche();

        System.out.println("--------------------------------------");

        //Calcul des périmètres
        System.out.println("Affichage des périmètres");
        System.out.println("Rectange: "+rect.perimetre());
        System.out.println("Carré: "+carr.perimetre());
        System.out.println("Cercle: "+cerc.perimetre());

        System.out.println("--------------------------------------");

        //calcul des surfaces
        System.out.println("Affichage des surfaces");
        System.out.println("Rectange: "+rect.surface());
        System.out.println("Carré: "+carr.surface());
        System.out.println("Cercle: "+cerc.surface());
    }
}
