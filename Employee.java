public class Employee {

    private String name;
    private String cpf;
    private String phone;
    private String position;
    private Address address;

    public Employee(String name, String cpf, String phone, String position, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
