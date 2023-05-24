package exceptions;

/**
 * Questa classe rappresenta una eccezione di tipo exceptions.DistributoreFullException
 * lanciata nel caso in cui inserisco un nuovo prodotto ma il  distributore ha
 * già raggiunto la capacità massima. Questa classe estende la classe Exception.
 */
public class DistributoreFullException extends Exception{

    /**
     * ritorna un messaggio che segnala all'utente che il distributore è pieno.
     * @return una stringa s contenente un messaggio di errore.
     */
    @Override
    public String getMessage() {
        return "Il distributore è pieno! Non puoi aggiungere prodotti";
    }
}
