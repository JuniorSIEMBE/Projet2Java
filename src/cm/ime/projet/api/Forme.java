package cm.ime.projet.api;

public abstract class Forme{

    //absice de l'origine
    private int origineX;

    //ordonnée de l'origine
    private int origineY;

    //constructeur
    public Forme(){
        this.origineX= 0;
        this.origineY= 0;
    }

    //getters
    public int getOrigineX(){
        return origineX;
    }

    public int getOrigineY(){
        return origineY;
    }

    //setters
    public void setOrigineX(int origineX){
        this.origineX= origineX;
    }

    public void setOrigineY(int y){
        origineY= y;
    }

    //calcul de la surface
    public abstract double surface();

    //affichage des attributs
    public abstract void affiche();

    //calcul du périmètre
    public abstract double perimetre();
}