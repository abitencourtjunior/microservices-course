package br.com.microservices.store.dto;

public class AddressDTO {

    private String street;
    private Short number;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressDTO [street=" + street + ", number=" + number + ", state=" + state + "]";
    }

}
