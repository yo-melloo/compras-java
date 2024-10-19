import java.util.ArrayList;

public class CartaoDeCredito {
    private String titular;
    private double limite;
    private double saldo;
    private ArrayList<Compra> compras;
    private double porcentagemUso;

    public CartaoDeCredito(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldo = this.limite;
    }

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
        return 100 - ((getSaldo() * 100) / getLimite());
    }

    public boolean aprovarCompra(Compra compra){
        if (this.getSaldo() >= compra.getValor()){
            this.saldo -= compra.getValor();
            System.out.println("Compra realizada!");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Titular: %S %nSaldo: R$ %s/%s (Usados: %s%%)", getTitular(), getSaldo(), getLimite(), (int) getPorcentagemUso());
    }
}
