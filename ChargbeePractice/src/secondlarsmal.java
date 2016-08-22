/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class secondlarsmal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,3,41};
        int first,second=0;
        first =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
            first = arr[i];
            
        }else if(arr[i]>second){
                second = arr[i];
        }      }
       
            
            
            
        
        System.out.println(second+" "+first);
        
    }
}
