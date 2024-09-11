package heroesMonsters.Models;

public interface ActionsInventaire {

    public void ajouter(String objet,int quantite);
    public void retirer(String objet, int quantite);
    public void afficher();
}
