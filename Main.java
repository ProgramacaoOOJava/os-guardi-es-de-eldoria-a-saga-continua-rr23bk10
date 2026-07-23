package eldoria;

import java.util.ArrayList;

/**
 * Classe principal.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");

        // Lista polimórfica
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando Magos
        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Merlina", 6, 55, 20.5));

        // Adicionando Guerreiros
        personagens.add(new Guerreiro("Thorgar", 8, 120, 15.0));
        personagens.add(new Guerreiro("Arthus", 5, 100, 12.5));

        // Percorrendo a lista
        for (Personagem personagem : personagens) {

            System.out.println("-------------------------");

            personagem.exibirStatus();

            personagem.usarHabilidade();

            System.out.println();
        }
    }
}
