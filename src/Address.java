public class Address {

    private String district;
    private String street;
    private int streetNumber;

    public Address(String a, String b, int c) {
        district = a;
        street = b;
        streetNumber = c;
    }
    public String getDistrict() {
        return district;
    }
    public String getStreet() {
        return street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setDistrict(String a) {
        district = a;
    }
    public void setStreet(String a) {
        street = a;
    }
    public void setStreetNumber(int a) {
        streetNumber = a;
    }
    public String toString() {
        return streetNumber + " " + street + ", " + district;
    }
}
