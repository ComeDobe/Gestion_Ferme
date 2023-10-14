package com.Dobe.Ferme.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = " FERME ")

public class Ferme extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Ferme")
    private Integer Id;
    private String Nom;
    private String Adresse;
    private String Surface;
    private String Sections;
    @ManyToOne
    @JoinColumn(name = "Id_Utilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "Id_Animal")
    private Animal animal;


    @ManyToOne
    @JoinColumn(name = "Id_Parcelle")
    private Parcelle parcelle;


}
