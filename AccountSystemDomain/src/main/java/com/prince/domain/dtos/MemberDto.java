package com.prince.domain.dtos;

import com.prince.domain.persistence.Member;

import java.io.Serializable;

public class MemberDto implements Serializable {
    private String name;
    private String surname;
    private String email;
    private int points;

    public MemberDto() {
    }

    public MemberDto(Member member){
        this.name = member.getName();
        this.email = member.getEmail();
        this.points = member.getPoints();
        this.surname = member.getSurname();
    }

    public MemberDto(String name, String surname, String email, int points) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.points = points;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", points=" + points +
                '}';
    }
}
