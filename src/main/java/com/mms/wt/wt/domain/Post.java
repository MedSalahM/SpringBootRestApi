package com.mms.wt.wt.domain;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class Post {


    @Id
    @GeneratedValue(generator = "GenerationType.AUTO")
    @Column(columnDefinition = "int(6)")
    private int id;
    @Column(columnDefinition = "varchar(100)")
    private String title;
    @Column(columnDefinition = "text",nullable = true)
    private String content ;
    @Column(columnDefinition = "varchar(25)")
    private String date;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private PostDetail postdetail;


}
