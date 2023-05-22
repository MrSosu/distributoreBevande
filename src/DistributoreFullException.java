public class DistributoreFullException extends Exception{

    @Override
    public String getMessage() {
        return "Il distributore è pieno! Non puoi aggiungere prodotti";
    }
}
