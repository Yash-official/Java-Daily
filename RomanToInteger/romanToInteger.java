import java.util.*;
class Solution {
    private static int getRomanValue(String s){
            switch(s){
            case "I":return 1;
            case "V":return 5;
            case "X":return 10;
            case "L":return 50;
            case "C":return 100;
            case "D":return 500;
            case "M":return 1000;
        }
        return -1;
    }
    public int romanToInt(String s) {
        String[] str =s.split("");
        int sum=0;
        for(int i=str.length-1;i>=0;i--){
            if(i>0){
                                
            if(str[i].equals("V") && str[i-1].equals("I")){
        
                sum+=4;
                --i;
            }else if(str[i].equals("X") && str[i-1].equals("I")){
            sum+=9; 
                --i;
            }else if(str[i].equals("C") && str[i-1].equals("X")){
            sum+=90;
                --i;
            }else if(str[i].equals("L") && str[i-1].equals("X")){
            sum+=40;
                --i;
            }else if(str[i].equals("M") && str[i-1].equals("C")){
            sum+=900;
                --i;
            }else if(str[i].equals("D") && str[i-1].equals("C")){
            sum+=400;
                --i;
            }else{
            sum+=getRomanValue(str[i]);
            }
                   
            }else{
                    sum+=getRomanValue(str[i]);
                }
        }
        return sum;
  }
}


Runtime: 16 ms, faster than 6.81% of Java online submissions for Roman to Integer.
Memory Usage: 39.7 MB, less than 21.22% of Java online submissions for Roman to Integer.
