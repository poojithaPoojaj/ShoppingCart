package com.project.shoppingcart;

public class Validator {
    public boolean isNameNotNullOrNotEmpty(String name){
        return  name!=null && !name.isEmpty();
    }
    public boolean isPasswordValid(int password){
       String value=String.valueOf(password);
       return value.length()>=5 && value.length()<7;
    }
}
