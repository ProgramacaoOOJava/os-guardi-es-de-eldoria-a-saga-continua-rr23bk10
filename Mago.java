package eldoria;

import java.util.ArrayList;

public class Mago extends Personagem implements Auditavel {

    private ArrayList<String> acoes = new ArrayList<>();

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: "
                + getNome()
                + " conjura uma bola de fogo!");
    }

    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {

        System.out.println("Ações auditadas:");

        for (String acao : acoes) {
            System.out.println("- " + acao);
        }
    }

}