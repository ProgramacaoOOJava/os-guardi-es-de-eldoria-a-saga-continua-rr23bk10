package eldoria;

import java.util.Objects;

/**
 * Classe abstrata base dos personagens.
 */
public abstract class Personagem {

    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    public Personagem(String nome, String classe, int nivel,
                      int pontosDeVida, double poderBase) {

        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public abstract void usarHabilidade();

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Método protegido solicitado
    protected void atribuirBencao(double valor) {
        poderBase += valor;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Personagem))
            return false;

        Personagem outro = (Personagem) obj;

        return Objects.equals(nome, outro.nome)
                && Objects.equals(classe, outro.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}