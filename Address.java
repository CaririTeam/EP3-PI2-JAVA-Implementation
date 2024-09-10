public class Address {
    
    private int idAddress;
    private String street;
    private String houseNumber;
    private String complement;
    private String district;
    private String city;
    private String postalCode;

    
    
    public Address(int idAddress, String street, String houseNumber, String complement, String district, String city, String postalCode) {
        this.idAddress = idAddress;
        this.street = street;
        this.houseNumber = houseNumber;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
    }

    
    public int getIdAddress() {
        return idAddress;
    }

    
    public void setIdAddress(int idAddress){
        this.idAddress = idAddress;
    }

    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    public String getHouseNumber() {
        return houseNumber;
    }
    
    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    
    public String getComplement() {
        return complement;
    }

    
    public void setComplement(String complement){
        this.complement = complement;
    }
    
    public String getDistrict() {
        return district;
    }

    
    public void setDistrict(String district) {
        this.district = district;
    }

    
    public String getCity(){
        return city;
    
    }

    
    public void setCity(String city) {
        this.city = city;
    
    }

    
    public String getPostalCode(){
        return postalCode;
     }

    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        
    }

     @Override
    public String toString() {
        return "Address{" + 
               "idAddress=>'" + idAddress + '\'' +
               ", street='" + street + '\'' +
               ", houseNumber='" + houseNumber + '\'' +
               ", complement='" + complement + '\'' +
               ", district='" + district + '\'' +
               ", city='" + city + '\'' +
               ", postalCode='" + postalCode + '\'' +
               '}';
    }
}
