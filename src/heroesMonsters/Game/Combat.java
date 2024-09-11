package heroesMonsters.Game;

import heroesMonsters.Models.Heros.Heros;
import heroesMonsters.Models.Monsters.Monstres;

public class Combat {

    public void rencontre(Heros hero, Monstres monstres){
        System.out.println("Un " + monstres.getNomClasse() + " apparaît !");

    }
}