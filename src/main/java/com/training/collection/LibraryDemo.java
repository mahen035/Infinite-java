package com.training.collection;
import java.util.Scanner;
public class LibraryDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Enter 9 to Quit");
        while(true){
            System.out.println("1:Add Members 2:Delete Member: 3:Search for a Member 9: to Quit");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter Member ID:");
                int memberId = sc.nextInt();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter address:");
                String address = sc.next();
                Member member = new Member(memberId, name, address);
                library.addMember(member);
                System.out.println("Member added Successfully");
            }
            else if(choice == 2){
                System.out.println("Enter memberId that you want to delete:");
                int id = sc.nextInt();
                Member member = library.getMember(id);
                library.deleteMember(member);
                System.out.println("Member removed Successfully");
            }

            else if(choice == 3){
                System.out.println("Enter memberId that you want to search:");
                int id = sc.nextInt();
                Member member = library.getMember(id);
                if(member == null){
                    System.out.println("Member not found");
                }
                else{
                    System.out.println(member);
                }

            }
            else if(choice == 9){
                break;
            }
            else{
                choice = 1;
            }

        }
    }
}
