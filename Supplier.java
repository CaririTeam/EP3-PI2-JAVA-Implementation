import java.util.List;

public class Supplier {

    private String corporateName;
    private String cnpj;
    private String phone;
    private String email;
    private Address address;
    private List<Product> products;

    public Supplier(String corporateName, String cnpj, String phone, String email, Address address, List<Product> products) {
        this.corporateName = corporateName;
        this.cnpj = cnpj;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.products = products;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getCnpj() {
        String str = "CNPJ: " + cnpj.substring(0,2) + "." + cnpj.substring(2,5) + "." 
                + cnpj.substring(5,8) + "/" + cnpj.substring(8,12) + "-" 
                + cnpj.substring(12,14);
        return str;
        
    }

    public void setCnpj(String cnpj) {
       if ((cnpj.length()!= 14) || !(cnpj.matches("\\d+"))){
            System.out.println("CNPJ invalido!!!");
            
        }else{
            this.cnpj = cnpj;
        }
    }

    public String getPhone() {
        
        String str = "Telefone: " + "(" + phone.substring(0,2)+")" + phone.substring(2, 7)
                + "-" + phone.substring(6,11);
        return str;
    }

    public void setPhone(String phone) {
        if((phone.length()!= 11)|| !(phone.matches("\\d+"))){
            System.out.println("Telefone invalido!!!");
        }else{
        this.phone = phone;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
