package com.DatabaseCunnection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="jpa_school")
public class school {

    @Id
    private String Id;
    private String sname;
    private String capasity;

}
