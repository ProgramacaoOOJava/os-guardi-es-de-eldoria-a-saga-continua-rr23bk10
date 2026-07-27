package eldoria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Merlina", 6, 55, 20.5));

        personagens.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        personagens.add(new Guerreiro("Thorgar", 8, 100, 15.0));

        for (Personagem personagem : personagens) {

            System.out.println("----------------------------");

            personagem.exibirStatus();

            personagem.usarHabilidade();

            if (personagem instanceof Mago) {

                Mago mago = (Mago) personagem;

                mago.registrarAcao("Conjurou bola de fogo");

                Auditavel auditavel = (Auditavel) mago;

                auditavel.auditarAcoes();
            }

            Personagem p = (Personagem) personagem;

            p.atribuirBencao(2.0);

            System.out.println("\nNovo status após a bênção:");

            p.exibirStatus();

            System.out.println();
        }

    }

}