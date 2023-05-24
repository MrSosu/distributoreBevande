package exceptions;

/**
 * Questa classe rappresenta una eccezione di tipo exceptions.SaldoNonSufficienteException
 * lanciata nel caso in cui il saldo nel distributore non sia sufficiente per l'acquisto.
 * Questa classe estende la classe Exception.
 */
public class SaldoNonSufficienteException extends Exception {

    /**
     * ritorna un messaggio che segnala all'utente che il saldo non è sufficiente.
     * @return una stringa s contenente un messaggio di errore.
     */
    @Override
    public String getMessage() {
        return "non hai una lira! Saldo non sufficiente";
    }
}
