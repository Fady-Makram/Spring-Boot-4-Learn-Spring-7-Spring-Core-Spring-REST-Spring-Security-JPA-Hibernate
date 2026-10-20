package com.luv2code.cruddemo.entity;
import jakarta.persistence.*;



// Entity Class Must have a public or protected no-argument constructor


@Entity
@Table(name="student")
public class Student {

    // define fields
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lasttName;

    @Column(name="email")
    private String email;


    // define constructors
    public Student() {

    }

    public Student( String firstName, String lasttName, String email) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
    }

    // define setters/getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }
    public String getEmail() {
        return email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // define toString methods


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

