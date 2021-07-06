package com.kk.question.three;

public class MimicBehaviourOfSet {

    Object[] arr;
    Object[] copiedArr;
    
    //constructor
    public MimicBehaviourOfSet() {
        arr = new Object[]{1,5,3};
    }

    int add(Object o){
        copiedArr = new Object[arr.length+1];
        for (int i = 0; i < copiedArr.length ; i++)
            try{
                copiedArr[i] = arr[i];
            }catch (ArrayIndexOutOfBoundsException e){
                for (int j = 0; j < arr.length; j++) {
                    if(o!=arr[j]){
                        copiedArr[i] = o;
                    }
                }
            }
        return 1;
    }

    void remove(Object o){

    }

    void showAll(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        MimicBehaviourOfSet mimic = new MimicBehaviourOfSet();
        mimic.add(1);


        mimic.showAll();
        System.out.println("-----------------");
        for (int i = 0; i < mimic.copiedArr.length; i++) {
            System.out.print(mimic.copiedArr[i] + " ");
        }
    }
}
