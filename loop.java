import java.util.Scanner;

    public class Loop{
         public static void main(String [] args){
             Scanner reader = new Scanner(System.in);
             System.out.println("Enter your input: ");
             String input = reader.nextLine();
             System.out.println("How many times should your input be shown? "); 
             int value = Integer.valueOf(reader.nextLine());
             for( i = value; i++){
               system.out.println(i);
}
}
}