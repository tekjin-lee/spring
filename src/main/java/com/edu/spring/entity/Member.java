package com.edu.spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;


@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT 설정 TODO
    //@GeneratedValue(strategy = GenerationType.AUTO) // IDENTITY 왜 오류가 문법오류 ?
    @Column(name = "MEMBER_ID")
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "BIRTHDAY")
    private Date birthday;
}
