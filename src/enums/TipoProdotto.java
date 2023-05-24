package enums;

/**
 * Enum rappresentante i possibili tipi di prodotto inseribili
 * nel distributore (in questo caso Caffè e Cappuccino).
 */
public enum TipoProdotto {

    CAFFE(1.00, 101, "Caffè"),
    CAPPUCCINO(1.50, 102, "Cappuccino");

    /** il prezzo del prodotto */
    private double price;
    /** il codice del prodotto */
    private int productCode;
    /** il nome del prodotto */
    private String name;

    /**
     * costruttore per il tipo prodotto
     * @param price un prezzo
     * @param productCode un codice prodotto
     * @param name il nome del prodotto
     */
    TipoProdotto(double price, int productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    /**
     * getter del prezzo
     * @return il prezzo del prodotto
     */
    public double getPrice() {
        return price;
    }

    /**
     * getter del productCode
     * @return il codice del prodotto
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * getter per il nome
     * @return il nome del prodotto.
     */
    public String getName() {
        return name;
    }
}
