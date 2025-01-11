package com.DatabaseCunnection.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="jpa_student")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String about;





    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL) // cascade os for save laptop data automatically
    private Laptop laptop;

// many adrress :

//    private List<Address>addressList; // list use for many address or we can use


    //@OneToMany // this is for unidirectional process
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL) // this is by directional process

    private List<Address>addressList=new ArrayList<>();






    public Student() { /// this is default  cons
    }

    public Student(int studentId, String studentName, String about, Laptop laptop) { // this is parameterise cos
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }




    public int getStudentId() {       // seetter getter
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;

    }







}

