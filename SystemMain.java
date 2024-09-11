import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class SystemMain {
    private List<Product> products = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Supplier> suppliers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Sale> sales = new ArrayList<>();
    private List<PurchaseRequest> purchaseRequests = new ArrayList<>();
    private List<ProductReceived> productsReceived = new ArrayList<>();
    private List<ExchangeAndReturn> exchangesAndReturns = new ArrayList<>();

    public void addProduct(int id, String name, String productCategory, double cost, double price, String manufacturer, 
    Date manufacturingDate, Date expirationDate, double minimumStock, double maximunStock, int corridor, 
    String shelf, String unitMeasurement) {
        Product product = new Product(id, name, productCategory, cost, price, manufacturer, 
        manufacturingDate, expirationDate, minimumStock, maximunStock, corridor, shelf, unitMeasurement, 
        new ArrayList<>());
        products.add(product);
    }

    public void addCustomer(String name, String cpf, String phone, Address address) {
        Customer customer = new Customer(name, cpf, phone, address);
        customers.add(customer);
    }

    public void addSupplier(String corporateName, String cnpj, String phone, String email, Address address) {
        Supplier supplier = new Supplier(corporateName, cnpj, phone, email, address, new ArrayList<>());
        suppliers.add(supplier);
    }

    public void addEmployee(String name, String cpf, String phone, String position, Address address) {
        Employee employee = new Employee(name, cpf, phone, position, address);
        employees.add(employee);
    }

    public void newSale(int id, Date date, List<ProductToOperate> itens, Customer customer, Employee employee, PaymentType payment, String observations) {
        Sale sale = new Sale(id, date, itens, customer, employee, payment, observations);
        sales.add(sale);
    }

    public void newPurchaseRequest(int id, Date date, List<ProductToOperate> itens, String observation, Supplier supplier) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(id, date, itens, observation, supplier);
        purchaseRequests.add(purchaseRequest);
    }

    public void newProductReceived(int id, Date date, List<ProductToOperate> itens, String observation) {
        ProductReceived productReceived = new ProductReceived(id, date, itens, observation);
        productsReceived.add(productReceived);
    }

    public void newExchangeAndReturn(int id, int idSale, List<ProductToOperate> itens, Date date, String observation, double voucher) {
        ExchangeAndReturn exchangeAndReturn = new ExchangeAndReturn(id, idSale, itens, date, observation, voucher);
        exchangesAndReturns.add(exchangeAndReturn);
    }

    public List<Product> productsList(){
        return products;
        }
        
    public List<Customer> customersList(){
        return customers;
        }
    
    public List<Supplier> suppliersList(){
        return suppliers;
        }
    
    public List<Employee> employeesList(){
        return employees;
        }
    
    public List<Sale> salesList(){
        return sales;
        }
    
    public List<PurchaseRequest> purchaseRequestsList(){
        return purchaseRequests;
        }
    
    public List<ProductReceived> productsReceivedtList(){
        return productsReceived;
        }
    
    public List<ExchangeAndReturn> ExchangesAndReturnsList(){
        return exchangesAndReturns;
        }
}
