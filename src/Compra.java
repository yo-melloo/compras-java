public class Compra {
    String nome;
//    String descricao;
    double valor;

    public Compra(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s%nValor: R$ %.2f", getNome(), getValor());
    }
}
