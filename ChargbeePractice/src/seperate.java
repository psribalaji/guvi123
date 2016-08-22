
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class seperate {
    public static void main(String[] args) {
        String s ="fs32fsd12aaa9ngng59";
        String s1="";
        String s2="";
        ArrayList list = new ArrayList();
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                s2+=c[i];
            }else{
                
                list.add(c[i]);
     
            }
        }
   
        System.out.println(list);
                System.out.println(s2);

    }
    
}
