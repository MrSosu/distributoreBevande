public enum TipoProdotto {

    CAFFE(1.00, 101),
    CAPPUCCINO(1.50, 102);

    private double price;
    private int productCode;

    TipoProdotto(double price, int productCode) {
        this.price = price;
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public int getProductCode() {
        return productCode;
    }
}
