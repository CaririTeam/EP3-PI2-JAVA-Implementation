import java.util.Date;
import java.util.List;

public class ProductReceived {
    private int idReceiving;
    private Date date;
    private List<ProductToOperate> itens;
    private String observations;

    public ProductReceived(int idReceiving, Date date, List<ProductToOperate> itens, String observations) {
        this.idReceiving = idReceiving;
        this.date = date;
        this.itens = itens;
        this.observations = observations;
    }

    public int getIdReceiving() {
        return idReceiving;
    }

    public void setIdReceiving(int idReceiving) {
        this.idReceiving = idReceiving;
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

    @Override
    public String toString() {
        return "ProductReceived{" +
               "idReceiving=" + idReceiving +
               ", date=" + date +
               ", itens=" + itens +
               ", observations='" + observations + '\'' +
               '}';
    }

}