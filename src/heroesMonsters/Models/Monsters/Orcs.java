package heroesMonsters.Models.Monsters;

import heroesMonsters.Utilitaires.De;

public class Orcs extends Monstres implements IOr{

    public Orcs(){
        super("Orc",1,0, false);
    }

    @Override
    public int getOr() {
        return De.D6.roll();
    }
}
