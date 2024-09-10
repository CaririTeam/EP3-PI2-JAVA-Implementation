import java.util.Date;
import java.util.List;

public class PurchaseRequest {
    
    private int idPurchase;
    private Date date;
    private List<ProductToOperate> itens;
    private String observations;
    private Supplier supplier;
    
    public PurchaseRequest(int idPurchase, Date date, List<ProductToOperate> itens, String observations, Supplier supplier) {
        this.idPurchase = idPurchase;
        this.date = date;
        this.itens = itens;
        this.observations = observations;
        this.supplier = supplier;
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

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
}
