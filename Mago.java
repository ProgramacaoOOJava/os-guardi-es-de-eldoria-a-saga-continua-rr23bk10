package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 */
public class Mago extends Personagem {

    /**
     * Construtor do Mago.
     */
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    /**
     * Habilidade específica do Mago.
     */
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome()
                + " conjura uma poderosa bola de fogo!");
    }
}