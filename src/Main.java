import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.io.File;  // Import the File class


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Integer> usedNums = new ArrayList<>();
    static ArrayList<Integer> prevNums = new ArrayList<>();

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




        prevNums.add(7);
        prevNums.add(8);
        prevNums.add(14);
        prevNums.add(16);
        prevNums.add(19);
        prevNums.add(20);
        prevNums.add(25);
        prevNums.add(31);
        prevNums.add(36);
        prevNums.add(43);
        prevNums.add(44);
        prevNums.add(46);
        prevNums.add(50);
        prevNums.add(53);
        prevNums.add(54);
        prevNums.add(55);
        prevNums.add(59);
        prevNums.add(61);
        prevNums.add(63);
        prevNums.add(65);

        Random x = new Random();
        int num;

        ArrayList<Integer> combo = new ArrayList<>();
        combo = new ArrayList<>();
        usedNums = new ArrayList<>();
        for(int j=1 ; j<=10 ; j++) {
            combo = new ArrayList<>();

            for(int i=1; i<=10; i++) {
                num =0;
                while(!numIsAcceptable(num)){
                    num = x.nextInt(1, 71);
                }

                combo.add(num);
                combo.sort(Comparator.naturalOrder());
                usedNums.add(num);

            }
            System.out.println("\n" +combo);
        }

    }
    private static boolean numIsAcceptable(int num){
        boolean shouldUse;
        Random x = new Random();

        if(num == 0 )
            return false;
        else if(usedNums.contains(num))
            return false;
        else if (prevNums.contains(num)){
            shouldUse = x.nextInt(0,100) > 75  ;
            return shouldUse;
        }
        return true;
    }
}