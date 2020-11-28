package com.techreturners.exercise001;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Exercise001 {
    public String capitalizeWord(String word) {
    
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
       
        return Character.toUpperCase(firstName.charAt(0)) +"." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        double vatPrice = originalPrice + (vatRate * 0.01 * originalPrice) ;
        String strValue = String.format("%.2f", vatPrice);

       return  Double.parseDouble(strValue);
    }

    public String reverse(String sentence) {

        List<String> reversedString = new LinkedList<>() ;

        for (String word: sentence.split(" ")){

            StringBuilder reversedWord =new StringBuilder(word).reverse();
            reversedString.add(reversedWord.toString());
        }

        Collections.reverse(reversedString);

        return String.join(" ",reversedString  );     
    }

    public int countLinuxUsers(List<User> users) {
        
        int linuxUserCount = 0;
        
         for(User user: users)
            if (user.getType().equals("Linux"))
                linuxUserCount++;

        return linuxUserCount;
    }
}
