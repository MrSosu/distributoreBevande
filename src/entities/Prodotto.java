package entities;

import enums.TipoProdotto;

/**
 * Questa classe rappresenta un generico prodotto che può essere inserito
 * nel distributore.
 */
public class Prodotto {

    /** il tipo di prodotto definito dall'enum enums.TipoProdotto */
    private TipoProdotto tipoProdotto;

    /**
     * un costruttore che crea un prodotto di tipoProdotto.
     * @param tipoProdotto il tipo di prodotto che sto creando.
     */
    public Prodotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    /**
     * getter per il tipoProdotto.
     * @return il tipo del prodotto.
     */
    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    /**
     * setter per il tipo prodotto.
     * @param tipoProdotto un nuovo tipoProdotto da settare.
     */
    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    /**
     * override del metodo toString() che stampa solo il nome del tipo
     * del prodotto.
     * @return una stringa rappresentante l'oggetto di tipo Prodotto.
     */
    @Override
    public String toString() {
        return tipoProdotto.getName();
    }
}
