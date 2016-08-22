/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class largestt {
    public static void main(String[] args) {
        int[] arr = {1,61,51,2,3,4,5,1,1};
        int small=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(small>arr[i])
                small =arr[i];
        }
    System.out.println(max);
    System.out.println(small);
    }        
}
