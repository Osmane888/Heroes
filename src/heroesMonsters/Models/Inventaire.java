package heroesMonsters.Models;

import java.util.HashMap;
import java.util.Map;

public class Inventaire implements ActionsInventaire{


    private Map<String ,Integer> inventaire ;

    public Inventaire(){
        this.inventaire = new HashMap<>();
    }


    //region METHODS
    public void ajouter(String objet, int quantite){
        inventaire.merge(objet, quantite,Integer::sum);
    }

    public void retirer(String objet, int quantite){
        if(inventaire.containsKey(objet)){
            int a = inventaire.get(objet);
            if(a >= quantite){
                inventaire.merge(objet,-quantite,Integer::sum);
            }
            else{
                throw new ArithmeticException("Vous n'avez pas la quantité requise");
            }
        }
        else{
            System.out.println("Vous ne possédez pas cet item");
        }
    }

    public void afficher(){
       for (Map.Entry<String, Integer> s : inventaire.entrySet()) {
            System.out.println("-> " + s.getKey() + " : " + s.getValue());
        }
        /*
        for (String s : inventaire.keySet()) {
            System.out.println("-> " + s + " : " + inventaire.get(s));
        }
         */
    }
    //endregion
}
