package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor do Guerreiro.
     */
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    /**
     * Habilidade específica do Guerreiro.
     */
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() +
                " desfere um golpe poderoso com sua espada!");
    }
}
