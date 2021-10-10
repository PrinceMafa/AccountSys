package com.prince.domain.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="Members")
public class Member implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private int points;

    public Member() {
    }

    public Member(Long id, String name, String surname, String email, int points) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.points = points;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return points == member.points && Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(surname, member.surname) && Objects.equals(email, member.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, points);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", points=" + points +
                '}';
    }
}
