import java.util.Date;
import java.util.List;

public class ExchangeAndReturn {
    private int idExchangeAndReturn;
    private int idSale;
    private List<ProductToOperate> itens;
    private Date date;
    private String observations;
    private Voucher voucher;

    public ExchangeAndReturn(int idExchangeAndReturn, int idSale, List<ProductToOperate> itens, 
                             Date date, String observations, Voucher voucher) {
        this.idExchangeAndReturn = idExchangeAndReturn;
        this.idSale = idSale;
        this.itens = itens;
        this.date = date;
        this.observations = observations;
        this.voucher = voucher;
    }

    public int getIdExchangeAndReturn() {
        return idExchangeAndReturn;
    }

    public void setIdExchangeAndReturn(int idExchangeAndReturn) {
        this.idExchangeAndReturn = idExchangeAndReturn;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public List<ProductToOperate> getItens() {
        return itens;
    }

    public void setItens(List<ProductToOperate> itens) {
        this.itens = itens;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "ExchangeAndReturn{" +
               "idExchangeAndReturn=" + idExchangeAndReturn +
               ", idSale=" + idSale +
               ", itens=" + itens +
               ", date=" + date +
               ", observations='" + observations + '\'' +
               ", voucher=" + voucher +
               '}';
    }
}
