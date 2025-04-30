package com.shubh.patientservice.dto;
/**
 * Benefits of using a DTO (Data Transfer Object):
 *
 * 1. Simplifies JSON structure by using only primitive or simple data types,
 *    making it easier to parse on the frontend.
 *
 * 2. Helps control data exposure by excluding fields that should not be
 *    shared with the frontend or external systems.
 *
 * 3. Improves separation of concerns by decoupling internal domain models
 *    from data representation used for API communication.
 */


public class PatientResponseDTO {

    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
