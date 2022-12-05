package com.groupeuisi.ParcInfo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true ,nullable = false ,  length = 150)
    private String nom;
    @ManyToMany(mappedBy = "appRoleEntity")
    private List<AppUserEntity> appUserEntity;
}
