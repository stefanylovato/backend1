package model;

public class Address {
    private Integer id;
    private String street;
    private int number;
    private String city;
    private String state;

    public Address(Integer id, String street, int number, String city, String state) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }


}
