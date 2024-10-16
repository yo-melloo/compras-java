public class Principal {
    public static void main(String[] args) {
        CartaoDeCredito meuCartao = new CartaoDeCredito("Gustavo", 3200);
        Compra compra = new Compra("Item 1", 320);

        System.out.println(meuCartao);
        System.out.println(compra);
    }
}
