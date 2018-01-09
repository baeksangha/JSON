package com.jsonparser;

import lombok.Data;

@Data
public class Tel {

    private String first;
    private String middle;
    private String last;

    public Tel(String tel) {
        this.first = tel.split("-")[0];
        this.middle = tel.split("-")[1];
        this.last = tel.split("-")[2];
    }
}
