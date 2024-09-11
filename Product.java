import java.util.Date;
import java.util.List;

public class Product {
    private int idProduct;
    private String name;
    private String productCategory;
    private double cost;
    private double price;
    private String manufacturer;
    private Date manufacturingDate;
    private Date expirationDate;
    private double minimumStockAlertLevel;  // Estoque mínimo para alertas
    private double maximunStock;  // Estoque máximo
    private double currentStock;  // Estoque atual
    private int corridor;
    private String shelf;
    private String unitMeasurement;
    private List<Supplier> suppliers;

    public Product(int idProduct, String name, String productCategory, double cost, double price, 
                   String manufacturer, Date manufacturingDate, Date expirationDate, 
                   double minimumStockAlertLevel, double maximunStock, double currentStock, 
                   int corridor, String shelf, String unitMeasurement, List<Supplier> suppliers) {
        this.idProduct = idProduct;
        this.name = name;
        this.productCategory = productCategory;
        this.cost = cost;
        this.price = price;
        this.manufacturer = manufacturer;
        this.manufacturingDate = manufacturingDate;
        this.expirationDate = expirationDate;
        this.minimumStockAlertLevel = minimumStockAlertLevel;
        this.maximunStock = maximunStock;
        this.currentStock = currentStock;  // Inicializando com o estoque atual
        this.corridor = corridor;
        this.shelf = shelf;
        this.unitMeasurement = unitMeasurement;
        this.suppliers = suppliers;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getMinimumStockAlertLevel() {
        return minimumStockAlertLevel;
    }

    public void setMinimumStockAlertLevel(double minimumStockAlertLevel) {
        this.minimumStockAlertLevel = minimumStockAlertLevel;
    }

    public double getMaximunStock() {
        return maximunStock;
    }

    public void setMaximunStock(double maximunStock) {
        this.maximunStock = maximunStock;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }

    public int getCorridor() {
        return corridor;
    }

    public void setCorridor(int corridor) {
        this.corridor = corridor;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    public String toString() {
        return "Product{" +
               "idProduct=" + idProduct +
               ", name='" + name + '\'' +
               ", productCategory='" + productCategory + '\'' +
               ", cost=" + cost +
               ", price=" + price +
               ", manufacturer='" + manufacturer + '\'' +
               ", manufacturingDate=" + manufacturingDate +
               ", expirationDate=" + expirationDate +
               ", minimumStockAlertLevel=" + minimumStockAlertLevel +
               ", maximunStock=" + maximunStock +
               ", currentStock=" + currentStock +
               ", corridor=" + corridor +
               ", shelf='" + shelf + '\'' +
               ", unitMeasurement='" + unitMeasurement + '\'' +
               ", suppliers=" + suppliers +
               '}';
    }
    
    // Método para adicionar ao estoque atual
    public void addToStock(double amount) {
        double newStock = this.currentStock + amount;

        // Verifica se o novo estoque ultrapassa o limite máximo
        if (newStock > this.maximunStock) {
            this.currentStock = this.maximunStock;
        } else {
            this.currentStock = newStock;
        }
    }

    // Método para repor estoque com base no recebimento de produtos
    public void replenishStock(ProductReceived productReceived) {
        // Percorre a lista de produtos recebidos
        for (ProductToOperate item : productReceived.getItens()) {
            Product product = item.getProduct();
            double amountToAdd = item.getAmount();

            // Para adicionar a quantidade ao estoque do produto usa-se aqui o método addToStock criado na linha 183
            product.addToStock(amountToAdd);
        }
    }
}
