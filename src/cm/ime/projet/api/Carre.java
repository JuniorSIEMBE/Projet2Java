package cm.ime.projet.api;

public class Carre extends Rectangle{

    public Carre(int cote) {
        super(cote, cote);
    }

    public Carre(int x, int y, int c){
        super(x, y, c, c);
    }

    //getter
    public int getCote(){
        return super.getLargeur();
    }

    //setter
    public void setCote(int c){
        super.setlargeur(c);
        super.setlongueur(c);
    }

    public void affiche(){
        System.out.println("Carré : "+super.getLargeur());
    }
    
}
