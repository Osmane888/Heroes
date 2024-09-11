package heroesMonsters.Utilitaires;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public enum De {
    D4(4),
    D6(6);

    private int nbFaces;

    private De(int nbFaces){
        this.nbFaces = nbFaces;
    }

    public int getNbFaces(){
        return nbFaces;
    }



    public int roll(){
        Random random = new Random();
        return random.nextInt(1,getNbFaces());
    }
    public int rolls(int nbLance, int nbGarde){
        List<Integer> listLance = new ArrayList<>();

        for (int i = 0; i < nbLance; i++) {
            listLance.add(roll());
        }

        return listLance.stream()
                .sorted(Comparator.reverseOrder()).limit(nbGarde).mapToInt(it -> it).sum();
    }
}