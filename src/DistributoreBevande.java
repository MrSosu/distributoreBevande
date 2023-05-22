import java.util.ArrayList;
import java.util.List;

public class DistributoreBevande {

        private int capacity;
        private List<Prodotto> products;
        private double saldo = 0;

    public DistributoreBevande(int capacity, List<Prodotto> products) {
        this.capacity = capacity;
        this.products = products;
    }

    public DistributoreBevande(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void caricaProdotto(Prodotto p) throws DistributoreFullException {
        if (products.size() < capacity) {
            products.add(p);
        }
        else throw new DistributoreFullException();
    }

    public void insertCoin(double money) {
        if (money < 0) throw new IllegalArgumentException("Non puoi caricare un saldo negativo!");
        saldo += money;
    }

    public Prodotto scegliProdotto(int codiceProdotto) throws SaldoNonSufficienteException {
        // controlliamo se il prodotto con tale codice sia presente
        int index_product = -1;
        double priceProduct = 0.0;
        for (int i = 0; i < products.size(); i++) {
            Prodotto p = products.get(i);
            if (p.getTipoProdotto().getProductCode() == codiceProdotto) {
                index_product = i;
                priceProduct = p.getTipoProdotto().getPrice();
                break;
            }
        }
        if (index_product == -1) throw new IllegalArgumentException("codice prodotto inesistente oppure prodotto terminato!");
        // controlliamo che il saldo sia sufficiente
        if (saldo < priceProduct) throw new SaldoNonSufficienteException();
        saldo -= priceProduct;
        return products.remove(index_product);
    }

}
