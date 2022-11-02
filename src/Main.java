import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.toLowerCase();
        int index = s.length(), counter = 0;
        char[] ch = new char[index];
        for (int i = 0; i < index; i++) {
            ch[i] = s.charAt(i);

        }
        if (index % 2 ==0){
        for (int m = 0; m < index /2; m++) {
            if (ch[m] != ch[(index- m- 1)]) {
            counter++;
            }


        }}else{
            for (int m = 0; m < (index-1) /2; m++) {
                if (ch[m] != ch[(index- m- 1)]) {
                    counter++;
                }

        }}
        if (counter > 1) {
            System.out.println("No");
        } else if (counter == 1) {
            System.out.println("Yes");

        }


    }}