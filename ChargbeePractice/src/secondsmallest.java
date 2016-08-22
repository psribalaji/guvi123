/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class secondsmallest {
    public static void main(String[] args) {
        
        int[] arr = {4,2,1,5,6};
        int small = Integer.MAX_VALUE;
        int second =0;
        for(int i=0;i<arr.length
                ;i++){
            if(small>arr[i]){
                second = small;
                small = arr[i];
                
            }else if(second>arr[i]){
                second = arr[i];
            }
        }
        System.out.println(second+" and "+small);
        System.out.println(Integer.MAX_VALUE);
    }
}
