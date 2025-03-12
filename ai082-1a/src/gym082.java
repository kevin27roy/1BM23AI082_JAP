//program 1a - gym membership

import java.util.Scanner;

public class gym082 {
    int age;
    String name;
    int dur;
    boolean isActive;
    int fee;
    int pfee;

    void ipvals() {
        Scanner scan = new Scanner(System.in);

        System.out.println("welcome");

        System.out.println("Enter name: ");
        name = scan.nextLine();

        System.out.println("Enter age: ");
        age = scan.nextInt();

        System.out.println("Enter duration in months: ");
        dur = scan.nextInt();

        System.out.println("Is the member active? ");
        isActive = scan.nextBoolean();

        System.out.println("Enter membership fee: ");
        fee = scan.nextInt();

        System.out.println("Enter promotional fee: ");
        pfee = scan.nextInt();

        scan.close();
    }

    int calcfee() {
        int tfee = fee*dur;

        if(isActive){
            tfee -= pfee;
        }
        return tfee;
    }

    void display(){
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + dur + " months");
        System.out.println("Active Member: " + (isActive ? "Yes" : "No"));
        System.out.println("Membership Fee (Monthly): $" + fee);
        System.out.println("Promotional Fee: $" + pfee);
        System.out.println("Total Membership Fee: $" + calcfee());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of members: ");

        int nmemb = scan.nextInt();
        gym082[] mem = new gym082[nmemb];

        for(int i=0; i< nmemb; i++){
            System.out.println("Enter details for member "+(i+1)+":");
            mem[i]=new gym082();
            mem[i].ipvals();
            mem[i].display();
        }
        scan.close();
    }
}