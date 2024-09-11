package heroesMonsters.Models.Monsters;

import heroesMonsters.Models.Personnages;
import heroesMonsters.Utilitaires.De;

public abstract class Monstres extends Personnages {

    private boolean depecable;

    Monstres(String nomClasse, int bonusForce, int bonusEndurance, boolean depecable){
        super(nomClasse, bonusForce, bonusEndurance);
        this.depecable = depecable;
    }


    //region GET/SET

    //endregion


    //region METHODS

    //endregion

}
