import java.util.Scanner;

public class strbufferhandle082{
    public static void main(String[] args){
        //task1 - checking capacity of StringBuffer objects
        StringBuffer sb1=new StringBuffer();
        System.out.println("capacity of StringBuffer object sb1: "+sb1.capacity());

        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("capacity of StringBuffer object sb2: "+sb2.capacity());

        //task2 - reversing contents of string and converting to uppercase
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter string: ");
        String ipstring=scan.nextLine();

        StringBuffer revbuffer=new StringBuffer(ipstring);
        revbuffer.reverse();
        String revuppercase=revbuffer.toString().toUpperCase();
        System.out.println("reversed string in uppercase: "+revuppercase);

        //task3 - reading string from console and appending it
        System.out.println("enter string: ");
        String appendstr=scan.nextLine();
        revbuffer.append(appendstr);
        System.out.println("string after appending: "+revbuffer);

        scan.close();
    }
}