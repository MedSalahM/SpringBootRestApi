package com.mms.wt.wt.domain;


import lombok.Data;


import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int(6)")
    private int id;
    @Column(columnDefinition = "varchar(100)")
    private String title;
    @Column(columnDefinition = "text",nullable = true)
    private String content ;
    @Column(columnDefinition = "varchar(150)")
    private Date date;


}
