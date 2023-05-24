package entities;

import exceptions.DistributoreFullException;
import exceptions.SaldoNonSufficienteException;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe rappresenta un distributore di bevande con un intero che rappresenti
 * la sua capacità, una lista di prodotti contenuti nel distributore e acquistabili e un saldo
 * inizialmente settato a 0.
 */
public class DistributoreBevande {

       /** la capacità del distributore */
        private int capacity;
       /** la lista di prodotti nel distributore */
       private List<Prodotto> products;
        /** il saldo del distributore */
        private double saldo = 0;

    /**
     * crea un nuovo distributore prendendo in input una capacità e una lista
     * di prodotti.
     * @param capacity la capacità del distributore
     * @param products la lista di prodotti da inserire nel distributore.
     */
    public DistributoreBevande(int capacity, List<Prodotto> products) {
        this.capacity = capacity;
        this.products = products;
    }

    /**
     * crea un nuovo distributore con una capacità e una lista di prodotti inizialmente
     * vuota.
     * @param capacity la capacità del distributore.
     */
    public DistributoreBevande(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    /**
     * un get per i prodotti.
     * @return la lista di prodotti nel distributore.
     */
    public List<Prodotto> getProducts() {
        return products;
    }

    /**
     * questo metodo prende in input un entities.Prodotto p e lo carica nel distributore.
     * Può lanciare una exceptions.DistributoreFullException se il distributore ha già raggiunto la capacità massima.
     * @param p un prodotto
     * @throws DistributoreFullException se il distributore è già pieno.
     */
    public void caricaProdotto(Prodotto p) throws DistributoreFullException {
        if (products.size() < capacity) {
            products.add(p);
        }
        else throw new DistributoreFullException();
    }

    /**
     * questo metodo prende in input un double money e carica i soldi nel distributore. Lancia una
     * IllegalArgumentException se la quantità di denaro è negativa.
     * @param money un quantitativo di denaro in double
     */
    public void insertCoin(double money) {
        if (money < 0) throw new IllegalArgumentException("Non puoi caricare un saldo negativo!");
        saldo += money;
    }

    /**
     * questo metodo prende in input il codice di un prodotto e ritorna il prodotto selezionato nel
     * distributore, sempre che esso sia presente (altrimenti lancia una IllegalArgumentException),
     * lo rimuove e decrementa il saldo in base al prezzo del prodotto scelto.
     * @param codiceProdotto il codice di un prodotto
     * @return un prodotto
     * @throws SaldoNonSufficienteException se il quantitativo di denaro nel distributore non è sufficiente
     * per l'acquisto.
     */
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

    /**
     * Questo metodo ritorna il saldo attuale nel distributore.
     * @return un double contenente il saldo attuale.
     */
    public double saldoAttuale() {
        return saldo;
    }

    /**
     * questo metodo restituisce il saldo rimanente e lo azzera.
     * @return il saldo rimanente nel distributore.
     */
    public double getResto() {
        double money = saldo;
        this.saldo = 0;
        return money;
    }

}
