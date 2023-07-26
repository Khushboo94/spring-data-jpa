package com.spring.datajpa.springdatajpa.hibernate.jpa;

import jakarta.persistence.*;

@Entity(name = "Client")
@Table(name = "client")
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long clientId;
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "address",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String address;
    @Column(
            name = "country",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String country;
    @Column(
            name = "contactNumber",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String contactNumber;
    @Column(
            name = "nationality",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nationality;
    @Column(
            name = "birthdate",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String birthdate;

    public Client() {
    }

    public Client(String name,
                  String address,
                  String country,
                  String contactNumber,
                  String nationality,
                  String birthdate) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.contactNumber = contactNumber;
        this.nationality = nationality;
        this.birthdate = birthdate;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
