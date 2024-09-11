package heroesMonsters.Models;

public record Position(
        int x,
        int y
) {
}

/*
 La classe record prends des attributs qui ont automatiquement des getter mais pas de setter.
 Ca sert à définir des attributs immuables
*/