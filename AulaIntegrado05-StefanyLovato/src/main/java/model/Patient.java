package model;

public class Patient {
    private Integer id;
    private String name;
    private String lastname;
    private String rg;
    private String registeredDate;
    private Integer addressID;

    public Patient(Integer id, String name, String lastname, String rg, String registeredDate, Integer addressID) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.rg = rg;
        this.registeredDate = registeredDate;
        this.addressID = addressID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }
}
