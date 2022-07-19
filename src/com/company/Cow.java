package com.company;

public class Cow {
    private String nickName;
    private String gender;
    private int weight;
    private int age;



    public Cow(String nickName, String gender, int weight, int age) {
        this.nickName = nickName;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
