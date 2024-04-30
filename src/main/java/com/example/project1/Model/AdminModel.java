package com.example.project1.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "admin_table")

public class AdminModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        String Username;
        String Email;
        String Password;



    }


