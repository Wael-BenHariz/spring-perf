package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage ;
    private String name ;
    private String type ;
    private byte[] image;

    @JsonIgnore
    @OneToMany(mappedBy = "image")
    List<Entreprise> entreprises ;

    public Long getIdImage() {
        return idImage;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Entreprise> getEntreprises() {
        return entreprises;
    }
}
