package com.mms.wt.wt.domain;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue(generator = "GenerationType.AUTO")
    @Column(columnDefinition = "int(6)")
    private int id;
    @Column(columnDefinition = "varchar(100)")
    private String link;


}
