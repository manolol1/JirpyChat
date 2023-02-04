// helping class for correctly displaying times

package xyz.manolol.jirpychat.helpers;

public class Padding {
    public static String padLeft(String str, int length){
        if(str.length() >= length) return str;
        
        int diff = length - str.length();
        String temp = "";
        
        for(int i = 0; i < diff; i++){
            temp += "0";
        }
        return temp + str;
    }
}
