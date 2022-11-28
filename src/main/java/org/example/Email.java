package org.example;
import java.util.Scanner;
public class Email {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] emails = new String[4];
        String[] gmailDomain = new String[4];
        String[] yahooDomain = new String[4];
        int k=0, m=0;
        System.out.println("Enter 4 email addresses:");
         for(int i =0;i<4; i++){
             emails[i]=sc.next();
             if(emails[i].contains("gmail")){
                 gmailDomain[k] = emails[i];
                 k++;
             }
             else if(emails[i].contains("yahoo")){
                 yahooDomain[m] = emails[i];
                 m++;
             }
         }

         System.out.println("Gmail::");
         for(int i=0;i<gmailDomain.length;i++) {
             System.out.println(gmailDomain[i]);
         }
        System.out.println("Yahoo::");
        for(int i=0;i<yahooDomain.length;i++) {
            System.out.println(yahooDomain[i]);
        }
    }
}
