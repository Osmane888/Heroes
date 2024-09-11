package heroesMonsters.Models.Monsters;

import heroesMonsters.Utilitaires.De;

public class Dragonnet extends Monstres implements ICuir, IOr{

    public Dragonnet(){
        super("Dragonnet",0,1, true);
    }

    @Override
    public int getCuir() {
        return De.D4.roll();
    }

    @Override
    public int getOr() {
        return De.D6.roll();
    }
}
