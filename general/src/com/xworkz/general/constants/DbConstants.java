package com.xworkz.general.constants;

public enum DbConstants {

    URL("jdbc:mysql://localhost:3306/generaldb"),
    USERNAME("root"),
    PASSWORD("@Mythsri.com10"),
    DRIVER("com.mysql.cj.jdbc.Driver");


    private final String prop;

    public String getProp() {
        return prop;
    }

    DbConstants(String prop) {
        this.prop = prop;
    }
}
