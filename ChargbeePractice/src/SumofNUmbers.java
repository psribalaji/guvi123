/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class SumofNUmbers {
    public static void main(String[] args) {
        String s = "fs32fsd12aaa9ngng59";
        char c[] = s.toCharArray();
       
                
        int sum=0;
        int num=0;
        for(int i=0;i<c.length;i++){
           
              try{
                  if(Integer.parseInt(String.valueOf(i))==Integer.parseInt(String.valueOf(i+1)))
                      
                      sum+= Integer.parseInt(String.valueOf(c[i]));
                      sum+= Integer.parseInt(String.valueOf(c[i+1]));
              }  catch(Exception e){
             //     System.out.println(e);
                          
              }
            
        }
        System.out.println(sum);
        
        
    }
}
