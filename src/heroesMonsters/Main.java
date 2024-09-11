package heroesMonsters;

import heroesMonsters.Models.Heros.Heros;
import heroesMonsters.Models.Heros.Humains;
import heroesMonsters.Models.Monsters.Dragonnet;
import heroesMonsters.Models.Monsters.Loups;
import heroesMonsters.Models.Monsters.Monstres;
import heroesMonsters.Models.Monsters.Orcs;

public class Main {

    public static void main(String[] args) {

        Heros protagoniste = new Humains();

        System.out.println("Bienvenue dans Heroes & Monsters ! Vous combattrez jusqu'à votre mort tout en empochant des récompenses");
        Monstres dragon = new Dragonnet();
        Monstres loup = new Loups();
        Monstres orc = new Orcs();

        protagoniste.loot(dragon);
        System.out.println("Voici votre inventaire : ");
        protagoniste.getInventaire().afficher();

        protagoniste.loot(loup);
        System.out.println("Voici votre : ");
        protagoniste.getInventaire().afficher();

        protagoniste.loot(orc);
        System.out.println("Voici votre : ");
        protagoniste.getInventaire().afficher();
    }


}
