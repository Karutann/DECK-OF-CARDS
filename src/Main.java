import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        char[] a = {'A','J','Q','K'};
        char[] number ={'2','3','4','5','6','7','8','9','1'};
        String[] f = {"Ace","Jack","Queen","King"};
        char[] b = {'D','H','S','C'};
        String[] g = {"Diamonds","Hearts","Spades","Clubs"};
        String input = ll.next();

        for (int i = 0; i < a.length; i++) {
            char ch = input.charAt(0);
            if (ch==a[i]){
                System.out.print(f[i]);
            }
        }
        for (int i = 0; i < number.length; i++) {
            char ch = input.charAt(0);
            if (ch==number[i]){
                if (ch=='1'){
                    System.out.print("10");
                }else {
                    System.out.print(number[i]);
                }
            }
        }
        System.out.print(" of ");
        for (int i = 0; i < b.length; i++) {
            char ch = input.charAt(input.length()-1);
            if (ch==b[i]){
                System.out.println(g[i]);
            }
        }
    }
}
