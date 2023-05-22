public class SaldoNonSufficienteException extends Exception {

    @Override
    public String getMessage() {
        return "non hai una lira! Saldo non sufficiente";
    }
}
