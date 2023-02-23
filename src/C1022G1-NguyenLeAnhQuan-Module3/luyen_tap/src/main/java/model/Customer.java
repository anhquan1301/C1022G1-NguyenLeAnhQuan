package model;

public class Customer {
   private int id;
    private String name;
    private String email;
    private String country;
    private String typeSong;

    public Customer() {
    }

    public Customer(int id, String name, String email, String country, String typeSong) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.typeSong = typeSong;
    }

    public Customer(String name, String email, String country, String typeSong) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.typeSong = typeSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(String typeSong) {
        this.typeSong = typeSong;
    }
}
