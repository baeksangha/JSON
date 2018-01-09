package com.jsonparser;

import lombok.Data;

@Data
public class Name {

    private String familyName;
    private String firstName;

    public Name(String name) {
        this.familyName = name.substring(0,1);
        this.firstName = name.substring(1);
    }
}//