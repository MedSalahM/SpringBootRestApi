package com.mms.wt.wt.models;

public class PostNotFoundException extends RuntimeException {

   public PostNotFoundException(int id){

        super("No Post Found with number "+id);

    }
}
