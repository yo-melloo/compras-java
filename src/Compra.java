public class Compra {
    private String nome;
//    String descricao;
    private double valor;

    public Compra(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s%nValor: R$ %.2f", getNome(), getValor());
    }
}
