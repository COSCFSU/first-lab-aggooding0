/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import java.util.ArrayList;
import java.util.LinkedList;

import edu.frostburg.cosc310.lab00.Lab00;

/**
 *
 * @author AyokaGooding
 */
public class GoodingAyokaLab00 implements Lab00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GoodingAyokaLab00 lab = new GoodingAyokaLab00();
        System.out.println(lab.problem0(9999));
        System.out.println(lab.problem1(9999));
        System.out.println(lab.problem2());
    }

    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            s = s + i;
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2() {
         LinkedList <String> linList = new LinkedList<>();
         ArrayList <String> arrList = new ArrayList<>();
         long start = System.currentTimeMillis();
        for(int i = 0; i<=99999; i++){
            linList.add(Integer.toString(i));
            
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        
        long start2 = System.currentTimeMillis();
        for(int i = 0; i<=99999; i++){
            
            arrList.add(Integer.toString(i));
        }
        long end2 = System.currentTimeMillis();
        
        
        return  end2-start2;
    }

}
