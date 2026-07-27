package eldoria;

import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 */
public abstract class Personagem {

    // Atributos encapsulados
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    /**
     * Construtor
     */
    public Personagem(String nome, String classe, int nivel,
                      int pontosDeVida, double poderBase) {

        this.nome = nome;
        this.classe = classe;
        setNivel(nivel);
        setPontosDeVida(pontosDeVida);
        this.poderBase = poderBase;
    }

    // Getters
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

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public void setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida >= 0) {
            this.pontosDeVida = pontosDeVida;
        }
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    /**
     * Método abstrato.
     */
    public abstract void usarHabilidade();

    /**
     * Exibe o status usando o toString().
     */
    public void exibirStatus() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nClasse: " + classe +
                "\nNível: " + nivel +
                "\nPontos de Vida: " + pontosDeVida +
                "\nPoder Base: " + poderBase;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Personagem)) {
            return false;
        }

        Personagem outro = (Personagem) obj;

        return Objects.equals(nome, outro.nome)
                && Objects.equals(classe, outro.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}