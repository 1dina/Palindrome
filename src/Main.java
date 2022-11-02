import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int index =s.length(),counter=0;

        if (index %2==0){
        for (int i=0;i <index/2;i++){
            if(s.charAt(i) !=s.charAt(index-i-1)){
                counter++;
            }}
            if (counter >1 || counter==0)
                System.out.println("No");
            else
                System.out.println("Yes");

    }else{
            for (int i=0;i <(index-1)/2;i++){
                if(s.charAt(i) !=s.charAt(index-i-1)){
                    counter++;
                }}
            if (counter >1)
                System.out.println("No");
            else
                System.out.println("Yes");


            }



}}