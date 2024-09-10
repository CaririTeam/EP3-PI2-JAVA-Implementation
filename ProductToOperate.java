public class ProductToOperate {
    private Product product;
    private double amount;

    public ProductToOperate(Product product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ProductToOperate{" +
               "product=" + product +
               ", amount=" + amount +
               '}';
    }
}
