/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author balaji
 */
public class Duplicate {
    public static void main(String[] args) {
String in ="a,b,c,d,eh,,eh,f";

List<String> list = Arrays.asList(in.split(","));

Set<String> hashset = new HashSet<String>(list);


for( String s: hashset){
    System.out.println(s+":" +Collections.frequency(list, s));
    
}



  

    
    }}

