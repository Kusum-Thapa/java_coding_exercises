package com.techreturners.kataexe;

import java.awt.List;

public class KataExe{
    
    public String  disemvowel(String str) {        
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    
    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        int wrongPriceCount =0;
        for (int i=0; i<productSold.size(); i++)
        {
            for (int j=0; j<products.size();j++)
            {
                if(productSold.get(i).equals( products.get(j))){
                    if((soldPrice.get(i)).compareTo(productPrices.get(j)) != 0)                      
                    {
                        wrongPriceCount++;
                    }
                }
            
            }
        }
        return wrongPriceCount;
    }

    public static int getUniqueCharacter(String s) {
        // Write your code here
        
    
        }

} 