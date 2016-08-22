/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balaji
 */
public class check1 {
    public static void main(String[] args) {
        
        String s = "a11b2n23";
        int total = 0;
for (char c : s.toCharArray()) {
    if (Character.isDigit(c)) {
        total += Character.getNumericValue(c);
    }

}
System.out.println(total);        
    }
}
