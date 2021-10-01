package cm.ime.projet.api;

public class Cercle extends Forme{

    private int rayon;

    //constructeur
    public Cercle(int r){
        //constructeur de la classe mère
        super();
        rayon= r;
    }

    public Cercle(int x, int y, int r){
        //setters de la classe mère
        super.setOrigineX(x);
        super.setOrigineY(y);
        rayon= r;
    }
    
    //getter
    public int getRayon(){
        return rayon;
    }

    //setter
    public void setRayon(int r){
        rayon= r;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return Math.PI*rayon*rayon;
    }

    @Override
    public void affiche() {
        // TODO Auto-generated method stub
        System.out.println("Cercle: "+rayon);
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return Math.PI*rayon*2;
    }
    
}
