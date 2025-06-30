package com.xworkz.comb.constants;

public enum DbConstant {
    RL("jdbc:mysql://localhost:3306/generaldb"),
    USERNAME("root"),
    PASSWORD("@Mythsri.com10"),
    DRIVER("com.mysql.cj.jdbc.Driver");


   private String prop;

    DbConstant(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }
}
