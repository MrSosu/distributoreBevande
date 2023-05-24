import entities.DistributoreBevande;
import entities.Prodotto;
import enums.TipoProdotto;
import exceptions.DistributoreFullException;
import exceptions.SaldoNonSufficienteException;

public class Main {

    public static void main(String[] args) throws DistributoreFullException, SaldoNonSufficienteException {

        DistributoreBevande distributore = new DistributoreBevande(10);

        Prodotto caffe = new Prodotto(TipoProdotto.CAFFE);
        // distributore.scegliProdotto(103); ---> questa riga lancia una eccezione.
        distributore.caricaProdotto(caffe);
        distributore.caricaProdotto(caffe);
        distributore.caricaProdotto(caffe);
        distributore.caricaProdotto(caffe);
        distributore.caricaProdotto(caffe);
        Prodotto cappuccino = new Prodotto(TipoProdotto.CAPPUCCINO);
        distributore.caricaProdotto(cappuccino);
        distributore.caricaProdotto(cappuccino);
        distributore.caricaProdotto(cappuccino);
        distributore.caricaProdotto(cappuccino);
        distributore.caricaProdotto(cappuccino);
        // distributore.caricaProdotto(caffe); ---> questa riga lancia una eccezione
        // distributore.scegliProdotto(101);    ---> questa riga lancia una eccezione
        distributore.insertCoin(5);
        System.out.println(distributore.saldoAttuale());
        distributore.scegliProdotto(101);
        System.out.println(distributore.saldoAttuale());
        System.out.println(distributore.getProducts());
        distributore.caricaProdotto(cappuccino);
        System.out.println(distributore.getProducts());
        distributore.scegliProdotto(102);
        distributore.scegliProdotto(101);
        System.out.println(distributore.getProducts());
        System.out.println(distributore.saldoAttuale());
        System.out.println(distributore.getResto());
        System.out.println(distributore.saldoAttuale());
    }

}
