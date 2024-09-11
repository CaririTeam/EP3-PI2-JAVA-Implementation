import java.util.Date;
import java.util.List;

public class Sale {

    private int idSale;
    private Date date;
    private List<ProductToOperate> itens;
    private Customer customer;
    private Employee employee;
    private PaymentType payment;
    private String observations;

    public Sale(int idSale, Date date, List<ProductToOperate> itens, Customer customer, Employee employee, PaymentType payment, String observations) {
        this.idSale = idSale;
        this.date = date;
        this.itens = itens;
        this.customer = customer;
        this.employee = employee;
        this.payment = payment;
        this.observations = observations;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ProductToOperate> getItens() {
        return itens;
    }

    public void setItens(List<ProductToOperate> itens) {
        this.itens = itens;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentType getPayment() {
        return payment;
    }

    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
