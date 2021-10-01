package cm.ime.projet.api;

public class Rectangle extends Forme{

    private int longueur;

    private int largeur;

    public Rectangle(int longueur, int largeur){
        //constructeur de la classe mère
        super();
        this.longueur= longueur;
        this.largeur= largeur;
    }

    public Rectangle(int x, int y, int longueur, int largeur){
        //setters de la classe mère
        super.setOrigineX(x);
        super.setOrigineY(y);
        this.longueur= longueur;
        this.largeur= largeur;
    }

    //getters
    public int getLongeur(){
        return longueur;
    }

    public int getLargeur(){
        return largeur;
    }

    //setters
    public void setlongueur(int l){
        longueur= l;
    }

    public void setlargeur(int l){
        largeur= l;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return longueur*largeur;
    }

    @Override
    public void affiche() {
        // TODO Auto-generated method stub
        System.out.println("Rectangle : "+longueur+" * "+largeur);
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return (longueur+largeur)*2;
    }
    
}
