/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class secondlargest {
    public static void main(String[] args) {
        int sec=0;
        int small=0;
      int[] arr = {10,1,5,2,3,4,6,9};
      for(int i=0;i<arr.length;i++){
     int max= arr[i];
          if(arr[i]<max){
              sec =max;
              max=arr[i];
           // sec = max;
          }else if(sec<arr[i]){
              sec=arr[i];
          }
      }
     
     // System.out.println(max);
            System.out.println(sec);
                    //    System.out.println(small);


    }
}
