package com.spring.security.domain;



import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

}


//@Entity
//public class Users {
//
//    @Column( name = "ID")
//    @Id
//
//    private Long id;
//    @Column( name = "USERNAME")
//    private String username;
//    @Column( name = "PASSWORD")
//    private String passowrd;
//
//
//    public Users(Long id, String username, String passowrd) {
//        this.id = id;
//        this.username = username;
//        this.passowrd = passowrd;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassowrd() {
//        return passowrd;
//    }
//
//    public void setPassowrd(String passowrd) {
//        this.passowrd = passowrd;
//    }
//
//    @Override
//    public String toString() {
//        return "Users{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", passowrd='" + passowrd + '\'' +
//                '}';
//    }
//}

