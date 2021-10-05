package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class Customer {
    @Id
    private String rsv_id;
    private String name;
    private int room;
    private int people;
    private String gender;
    private String nationality;
    private Date c_i;
    private Date c_o;
    private Date rsv_date;
    private String rsv_type;
    private String channel;
    private String purpose;
}
