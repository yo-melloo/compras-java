import java.util.ArrayList;

public class CartaoDeCredito {
    private String titular;
    private double limite;
    private double saldo;
    private ArrayList<Compra> compras;
    private double porcentagemUso;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getPorcentagemUso() {
        return ((getSaldo() * 100) / getLimite()) - 100;
    }

    public CartaoDeCredito(String titular, double limite){
        this.limite = limite;
        this.saldo = this.limite;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return String.format("Titular: %S %nSaldo: R$ %.2f/%.2f (Usados: %s%%)", getTitular(), getSaldo(), getLimite(), getPorcentagemUso());
    }
}
