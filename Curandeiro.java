package eldoria;

/**
 * Classe que representa um Curandeiro no reino de Eldoria.
 */
public class Curandeiro extends Personagem {

    /**
     * Construtor do Curandeiro.
     */
    public Curandeiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Curandeiro", nivel, pontosDeVida, poderBase);
    }

    /**
     * Habilidade específica do Curandeiro.
     */
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome()
                + " lança uma cura divina restaurando seus aliados!");
    }
}