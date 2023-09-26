package com.example.updates_error.tablitsa;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table(name = "second_table")
public class SecondTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long ids;

    @Column
    public String name;

    @Column
    public String surname;

    @Column
    public int year;

    @Column
    public String address;

    @Column
    public char gender;

    public SecondTable() {
    }

    public SecondTable(long ids, String name, String surname, int year, String address, char gender) {
        this.ids = ids;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.address = address;
        this.gender = gender;
    }

    public long getIds() {
        return ids;
    }

    public void setIds(long ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
