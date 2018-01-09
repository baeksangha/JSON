package com.jsonparser;

import lombok.Data;

@Data
public class Sample {
    private Name name;
    private String address;
    private Tel tel;
    private int age;

    public String[] getAddress() {
        return this.address.split(" ");
    }

    public int getBornYear() {
        return 2018-this.age;
    }
}
