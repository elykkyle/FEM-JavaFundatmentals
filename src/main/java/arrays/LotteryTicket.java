package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    //declaring a constant (keyword 'final' means it can't change)
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        var ticket = generateNumbers();
        printTicket(ticket);
    }
/**

 **/
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++){
            int randomNumber;

            do{
              randomNumber  = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static boolean search(int[] array, int numberToSearchFor){
        // "enhanced for loop"
        for(int value : array){
            if(value == numberToSearchFor) return true;
        }
        return false;
    }

    public static void printTicket(int[] array){
        Arrays.sort(array);
//        for(int number : array){
//            System.out.print(number + " | ");
//        }
        for(int i = 0; i < array.length; i++){
            if (i < array.length - 1) {
                System.out.print(array[i] + " | ");
            } else System.out.println(array[i]);
        }
    }
}
