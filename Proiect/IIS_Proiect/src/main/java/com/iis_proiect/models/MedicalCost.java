package com.iis_proiect.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document("Medical_Cost")
public class MedicalCost implements Comparable<MedicalCost>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;

    private Integer age;

    private String sex;

    private Integer bmi;

    private Integer children;

    private String smoker;

    private String region;

    public MedicalCost()
    {
        super();
        this.age = null;
        this.sex = null;
        this.bmi = null;
        this.children = null;
        this.smoker = null;
        this.region = null;
    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getBmi() {
        return bmi;
    }

    public void setBmi(Integer bmi) {
        this.bmi = bmi;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public int compareTo(MedicalCost o) {
        return 0;
    }
}
