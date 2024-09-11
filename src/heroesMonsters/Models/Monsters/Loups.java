package heroesMonsters.Models.Monsters;

import heroesMonsters.Utilitaires.De;

public class Loups extends Monstres implements ICuir{


    public Loups(){
        super("Loup", 0,0, true);
    }

    @Override
    public int getCuir() {
        return De.D4.roll();
    }
}
