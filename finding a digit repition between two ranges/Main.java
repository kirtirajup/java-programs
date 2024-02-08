import java.util.Scanner;

public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial range : ");
        int min = sc.nextInt();

        System.out.print("Enter the final range : ");
        int max = sc.nextInt();

        StringBuilder array = new StringBuilder();

        for(int i=min; i<=max; i++){
            int str = i;
            array.insert(0 , ("" + str));
        }

        System.out.print("Enter the required digit : ");
        // int digit = sc.nextInt();
        // char targetDigit = (char) digit;
        String digit = sc.next();
        char targetDigit = digit.charAt(0);
        System.out.println(digit);
        sc.close();
        System.out.println(array);
        String list = array.toString();
        int count = 0;
        for(int i=0; i<list.length(); i++){
            char a = list.charAt(i);
            System.out.print(a);
            if(a == targetDigit){
                count++;
            }
        }
        // System.out.println( );
        System.out.println("\nOccurence = " + count);
    }
}