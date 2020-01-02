package com.mms.wt.wt.domain;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Galerie {

    @Id
    @GeneratedValue(generator = "GenerationType.AUTO")
    @Column(columnDefinition = "int(6)")
    private int id;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Photo> photos;



}
