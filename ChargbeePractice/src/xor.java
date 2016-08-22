/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class xor {
    public static void main(String[] args) {
        
        String s = "100110";
        char c[] = s.toCharArray();
        String s1="";
        for(int i=0;i<c.length;i++){
c[i]^=1;
        }
        for(int i=0;i<c.length;i++)
                System.out.print(c[i]);
        
    }
}
