package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
    
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
       
        return Character.toUpperCase(firstName.charAt(0)) +"." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatPrice = originalPrice + (vatRate * 0.01 * originalPrice) ;
        String strValue = (String) String.format("%.2f", vatPrice);
       return  Double.parseDouble(strValue);
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
