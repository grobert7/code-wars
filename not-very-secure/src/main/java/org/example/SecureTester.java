package org.example;

public class SecureTester{

    public static boolean alphanumeric(String s){
        if (s.isEmpty()) {
            return false;
        }
        String pattern= "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }

}