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

        // Adicionando Curandeiros
        personagens.add(new Curandeiro("Lyanna", 6, 70, 14.0));
        personagens.add(new Curandeiro("Aelith", 9, 90, 17.5));

        // Percorrendo a lista
        for (Personagem personagem : personagens) {

            System.out.println("----------------------------------");

            // Exibe os dados do personagem
            personagem.exibirStatus();

            // Executa a habilidade (polimorfismo)
            personagem.usarHabilidade();

            // Identifica o tipo do personagem
            if (personagem instanceof Mago) {
                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Mago de nível "
                        + personagem.getNivel() + ".");
            }

            if (personagem instanceof Guerreiro) {
                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Guerreiro de nível "
                        + personagem.getNivel() + ".");
            }

            if (personagem instanceof Curandeiro) {
                System.out.println("O personagem "
                        + personagem.getNome()
                        + " é um Curandeiro de nível "
                        + personagem.getNivel() + ".");
            }

            System.out.println();
        }

        // Comparação utilizando equals()

        Personagem p1 = personagens.get(0); // Eldoran
        Personagem p2 = personagens.get(3); // Arthus
        Personagem p3 = new Mago("Eldoran", 10, 90, 30.0);

        System.out.println("========== COMPARAÇÕES ==========\n");

        if (p1.equals(p2)) {
            System.out.println("Comparando, "
                    + p1.getNome()
                    + " e "
                    + p2.getNome()
                    + " são iguais.");
        } else {
            System.out.println("Comparando, "
                    + p1.getNome()
                    + " e "
                    + p2.getNome()
                    + " são diferentes.");
        }

        if (p1.equals(p3)) {
            System.out.println("Comparando, "
                    + p1.getNome()
                    + " e "
                    + p3.getNome()
                    + " são iguais.");
        } else {
            System.out.println("Comparando, "
                    + p1.getNome()
                    + " e "
                    + p3.getNome()
                    + " são diferentes.");
        }
    }
}