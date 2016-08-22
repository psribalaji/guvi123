
import java.util.Arrays;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class stringdulpicate {
    public static void main(String[] args) {
        
        String s = "sribalaji";
        
        char c[] = s.toCharArray();
            Arrays.sort(c);
        for(int i=0;i<c.length;i++){
           if(c[i]==c[i+1]){
               c[i]= c[i];
           }else{
               
           }
            System.out.println(c[i]);
            
        }
        
      /*  HashSet<Character> set = new HashSet<>();
        for(int i=0;i<c.length;i++){
        set.add(c[i]);
        }
        String s1 = set.toString();*/
        System.out.println();
    }
    //System.out.println(c);
}
