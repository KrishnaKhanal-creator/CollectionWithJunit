package com.kk.question.one;

import static com.kk.question.one.Client.askDesireLocation;

public class InsertService {
    Client client = new Client();
    ListEntity listEntity = new ListEntity();

    public String reverseCase(String inputText){
        char[] chars = inputText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if(Character.isUpperCase(character)){
                chars[i] = Character.toLowerCase(character);
            } else if(Character.isLowerCase(character)) {
                chars[i] = Character.toUpperCase(character);
            }
        }
        return new String(chars);
    }

    public int insertIntoList(String inputElement){
        boolean inputBoolean;
        if(inputElement.equalsIgnoreCase("true")){
            inputBoolean = false;
            listEntity.getObjectsList().add(askDesireLocation(),inputBoolean);
        }else if (inputElement.equalsIgnoreCase("false")){
            inputBoolean = true;
            listEntity.getObjectsList().add(askDesireLocation(),inputBoolean);
        }else if (inputElement.length() == 1){
            char charElement = inputElement.charAt(0);
            int intElement = charElement + 1;
            charElement = (char)intElement;
            listEntity.getObjectsList().add(askDesireLocation(),charElement);
        }else if (inputElement.length() >1 &&
                (!inputElement.equalsIgnoreCase("true")) &&
                (!inputElement.equalsIgnoreCase("false") && (!inputElement.contains(".")&& (!inputElement.matches("\\d{1,}") )))){
            String caseChangingElement = reverseCase(inputElement);
            listEntity.getObjectsList().add(askDesireLocation(),caseChangingElement);
        }else if(inputElement.contains(".")){
            double inputDouble = Double.parseDouble(inputElement)+2.0;
            listEntity.getObjectsList().add(askDesireLocation(),inputDouble);
        }else if(inputElement.matches("\\d{1,}")){
            int inputInt = Integer.parseInt(inputElement);
            inputInt = inputInt + 1;
            listEntity.getObjectsList().add(askDesireLocation(),inputInt);
        }else System.out.println("Something went wrong Please Try again!!");
        System.out.println("The NEW updated list looks like this: \n\n\t\t\t\t\t\t\t\t\t\t\t" + listEntity.getObjectsList() + "\n");
        return 1;
    }


}
