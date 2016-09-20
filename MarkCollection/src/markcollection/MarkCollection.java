/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 *
 */
public class MarkCollection {

    private int[] marks = new int[3];

    public MarkCollection(int markOne, int markTwo, int markThree) {
        this.marks = new int[]{markOne, markTwo, markThree};

    }

    public double getAverage() {
        double totalNum = 0;
        for (int mark : marks) {
            totalNum += mark;
        }
        return totalNum / marks.length;
//        int sum = 0;
//        for(int mark = 0 ; mark >= 3; mark ++){
//            sum = sum + marks [mark];
//        }
//        return sum;
    }

    public double getGrades() {
        double markAvg = this.getAverage();
        if (markAvg >= 90) {

            return 1.1;
        } else if (markAvg >= 70 && markAvg < 90) {
            return 2.1;
        } else if (markAvg >= 50 && markAvg < 70) {
            return 2.2;
        }

        return 3.0;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int number = s.nextInt();
        System.out.println();
        
         HashMap<String, MarkCollection>  mlist = new HashMap<>();
         
            while (number -- > 0);
            System.out.println("Enter the name of the student:");
            String name = s.nextLine();
            int marks[] = new int[3];
            System.out.println("Enter the number of marks: ");
            for (int i = 1; i <= marks.length; i++) {
            marks[i - 1] = s.nextInt();
            }
            mlist.put(name, new MarkCollection(marks[0],marks[1],marks[2]));
    
    }
    {
            for(Entry<String, MarkCollection> entry :mlist.entrySet()){
            System.out.println(" Student Name:"+" "+mark.getKey()+"\n"+" Student"+" "+mark.getKey()+" "+"Average is: "+mark.getValue().getAverage()+"\n"+" "+"Student"+" "+mark.getKey()+" "+"was Graded:"+entry.getValue().getGrades());   
            System.out.println();
    }
    
      System.out.println("Student Names:");
       for(String name: mlist.keySet()){
       System.out.print(name);
       System.out.println(); 
        }
    }
        }


        
    
    
