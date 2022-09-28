public class Sistema {
    public static void main(String[] args) {
        Produto p = new Produto("Bicicleta", "Monark", 120.0);
        Lote lote = new Lote(p, 10, new Date());
    }
}
