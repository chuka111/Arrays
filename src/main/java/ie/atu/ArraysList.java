package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraysList {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int userInput = 0;

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);



        for (int i = 0; i <= 9; i++) {


            System.out.println("Element at index : " + arrayList.get(i));
        }

        System.out.println("please enter a new number: ");
        Scanner inputs = new Scanner(System.in);
        userInput = inputs.nextInt();


        arrayList.add(userInput);

        for (int i = 0; i <= 10; i++) {


            System.out.println("Element at index : " + arrayList.get(i));
        }


    }
}
