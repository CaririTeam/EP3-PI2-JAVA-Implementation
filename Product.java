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
    private double minimunStock;
    private double maximunStock;
    private int corridor;
    private String shelf;
    private String unitMeasurement;
    private List<Supplier> suppliers;

    public Product(int idProduct, String name, String productCategory, double cost, double price, 
                   String manufacturer, Date manufacturingDate, Date expirationDate, double minimunStock, 
                   double maximunStock, int corridor, String shelf, String unitMeasurement,List<Supplier> suppliers) {
        this.idProduct = idProduct;
        this.name = name;
        this.productCategory = productCategory;
        this.cost = cost;
        this.price = price;
        this.manufacturer = manufacturer;
        this.manufacturingDate = manufacturingDate;
        this.expirationDate = expirationDate;
        this.minimunStock = minimunStock;
        this.maximunStock = maximunStock;
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

    public double getMinimunStock() {
        return minimunStock;
    }

    public void setMinimunStock(double minimunStock) {
        this.minimunStock = minimunStock;
    }

    public double getMaximunStock() {
        return maximunStock;
    }

    public void setMaximunStock(double maximunStock) {
        this.maximunStock = maximunStock;
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
               ", minimunStock=" + minimunStock +
               ", maximunStock=" + maximunStock +
               ", corridor=" + corridor +
               ", shelf='" + shelf + '\'' +
               ", unitMeasurement='" + unitMeasurement + '\'' +
               ", suppliers=" + suppliers +
               '}';
    }
    
}


