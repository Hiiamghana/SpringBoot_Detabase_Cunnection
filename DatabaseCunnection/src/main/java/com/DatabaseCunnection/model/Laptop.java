package com.DatabaseCunnection.model;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;


    @OneToOne
    @JoinColumn(name="student_id") // this is for join collumn rename
    private Student student;


    public Laptop() {
    }

    public Laptop(int laptopId, String modelNumber, String brand, Student student) {
        this.laptopId = laptopId;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.student = student;

    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;



    }
}
