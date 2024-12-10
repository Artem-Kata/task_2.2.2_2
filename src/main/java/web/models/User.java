package web.models;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    @NotEmpty(message = "Name is not empty")
    @Size(min = 2, max = 25, message = "Name (2-25 characters)")
    private String name;

    @Column (name = "age")
    @Min(value = 0, message = "Age >= 0 years")
    private int age;

    @Column (name = "email")
    @NotEmpty (message = "Email is not empty")
    @Email(message = "Email is not valid")
    private String email;

    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User() {

    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
