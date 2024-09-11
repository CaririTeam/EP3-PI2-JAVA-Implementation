// Atributos da Classe
public class Customer {
    private String name;
    private String cpf;
    private String phone;
    private Address address;
    // Método Construtor
    public Customer(String name, String cpf, String phone, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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