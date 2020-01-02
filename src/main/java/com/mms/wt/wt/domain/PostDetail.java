package com.mms.wt.wt.domain;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class PostDetail {
    @Id
    @GeneratedValue(generator = "GenerationType.AUTO")
    @Column(columnDefinition = "int(6)")
    private int id;
    @OneToOne(mappedBy = "postdetail")
    private Post post ;
    @OneToOne
    private Photo background ;
    @OneToOne
    private Galerie galerie ;
}

