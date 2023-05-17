package com.example.integration.models;

public class MedicalCostView {
    private String Id;
    private Integer age;
    private String sex;
    private Integer bmi;
    private Integer children;
    private String smoker;
    private String region;

    public MedicalCostView() {
    }

    public MedicalCostView(String id, Integer age, String sex, Integer bmi, Integer children, String smoker, String region) {
        Id = id;
        this.age = age;
        this.sex = sex;
        this.bmi = bmi;
        this.children = children;
        this.smoker = smoker;
        this.region = region;
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
}
