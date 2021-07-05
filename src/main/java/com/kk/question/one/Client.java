package com.kk.question.one;

import java.util.Scanner;

public class Client {

    private static Scanner input = new Scanner(System.in);

    public String askElement(){
        String desireElement = null;
        while (desireElement== null){
            System.out.println("Enter any Element you want to insert in a List<Object> : \n or Enter \"#\" to exit:");
             desireElement = input.nextLine();
             if(desireElement.equals("#")){
                 System.out.println("Thank you for your time!!\n" +
                         "See you Next time!\n");
                 System.exit(0);
             }
        }
        return desireElement;
    }

    public static int askDesireLocation(){
        int desireLocation = 0;
        while (desireLocation < 1 | desireLocation > 5) {
            System.out.println("Enter any Desired Location: ");
            desireLocation = input.nextInt();
            if(desireLocation < 1 | desireLocation > 5)
                System.out.println("Only values between 1-5 are allowed, please try again");
        }
        return desireLocation;
    }

    public static void main(String[] args) {
        InsertService insertService = new InsertService();
        Client client = new Client();
        while (true){
            insertService.insertIntoList(client.askElement());
            input.nextLine();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        }
    }
}
