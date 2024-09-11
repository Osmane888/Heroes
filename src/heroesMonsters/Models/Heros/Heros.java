package heroesMonsters.Models.Heros;


import heroesMonsters.Models.*;
import heroesMonsters.Models.Monsters.ICuir;
import heroesMonsters.Models.Monsters.IOr;
import heroesMonsters.Models.Monsters.Monstres;

public abstract class Heros extends Personnages {

    final private Inventaire inventaire;

    Heros(String nomClasse, int bonusForce, int bonusEndurance){
        super(nomClasse,bonusForce, bonusEndurance);
        inventaire = new Inventaire();
    }


    //region GET/SET
    public Inventaire getInventaire() {
        return inventaire;
    }
    //endregion


    //region METHODS
    public void loot(Monstres monstre){
        if (monstre instanceof ICuir cuir){
            inventaire.ajouter("Cuir",cuir.getCuir());
        }
        if(monstre instanceof IOr or ){
            inventaire.ajouter("Or",or.getOr());
        }
    }
    //endregion
}