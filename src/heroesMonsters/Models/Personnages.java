package heroesMonsters.Models;

import heroesMonsters.Utilitaires.De;

public abstract class Personnages {

    private int endurance;
    private int force;
    private int pv;
    private String nomClasse;

    public Personnages(String nomClasse, int bonusEndurance, int bonusForce) {
        this.endurance = De.D6.rolls(4,3) + bonusEndurance;
        this.force = De.D6.rolls(4,3) + bonusForce;
        this.pv = endurance + modificateur(endurance) ;
        this.nomClasse = nomClasse;
    }


    //region GET/SET
    public int getEndurance() {
        return endurance;
    }
    public int getForce() {
        return force;
    }
    public int getPv() {
        return pv;
    }
    public boolean isAlive(){
        return getPv() > 0;
    }
    public String getNomClasse() {
        return nomClasse;
    }


    private void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    private void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    private void setForce(int force) {
        this.force = force;
    }
    private void setPv(int pv) {
        this.pv = pv;
    }
    //endregion

    //region METHODS
    private int modificateur(int valeur){
        if(valeur < 5){
            valeur = -1;
        } else if(valeur < 10){
            valeur = 0;
        } else if(valeur < 15){
            valeur = 1;
        } else {
            valeur = 2;
        }
        return valeur;
    }
    /*private void modifStats(){
        if(this instanceof Humains){
            this.setForce(this.getForce() + 1);
            this.setEndurance(this.getEndurance() + 1);
        } else if (this instanceof Nains) {
            this.setEndurance(this.getEndurance()+2);
        } else if (this instanceof Orcs) {
            this.setForce(this.getForce() + 1);
        } else if (this instanceof Dragonnet){
            this.setForce(this.getEndurance() + 1);
        }
    }*/


    public int frapper(Personnages personnageCible){
        int degats = De.D4.roll() + modificateur(getForce());
        personnageCible.setPv(personnageCible.getPv() - degats);
        return degats;
    }
    //endregion
}