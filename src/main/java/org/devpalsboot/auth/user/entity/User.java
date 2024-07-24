package org.devpalsboot.auth.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Entity
@Table(name = "sc_user")
@DynamicInsert
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @Column(name = "email", nullable = false, length = 128, unique = true)
    private String email;

    @Column(name = "encrypt_password")
    private String encryptPassword;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "delete_time")
    private Date deleteTime;
}
