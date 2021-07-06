package com.kk.question.three;

public class MimicService {
    MimicEntity mimicEntity = new MimicEntity();

    int add(Object o){
        mimicEntity.addingArr= new Object[mimicEntity.arr.length+1];
        for (int i = 0; i < mimicEntity.addingArr.length ; i++)
            try{
                mimicEntity.addingArr[i] = mimicEntity.arr[i];
            }catch (ArrayIndexOutOfBoundsException e){
                for (int j = 0; j < mimicEntity.arr.length; j++) {
                    if(o!=mimicEntity.arr[j]){
                        mimicEntity.addingArr[i] = o;
                    }else{
                        mimicEntity.addingArr = mimicEntity.arr;
                        return -1;
                    }
                }
            }
        mimicEntity.arr=mimicEntity.addingArr;
        return 1;
    }

    //made boolean return just to do unit test
    boolean remove(Object o){
        mimicEntity.removingArr = new Object[mimicEntity.arr.length-1];
        for (int i = 0; i < mimicEntity.arr.length; i++) {
            try{
                if(mimicEntity.arr[i] != o){
                    mimicEntity.removingArr[i] = mimicEntity.arr[i];
                }
            }catch (ArrayIndexOutOfBoundsException ignored){
            }
        }
        mimicEntity.arr = mimicEntity.removingArr;
        return true;
    }
    //made boolean return just to do unit test
    boolean showAll(){
        for (int i = 0; i < mimicEntity.arr.length; i++) {
            System.out.print(mimicEntity.arr[i] + " ");
        }
        return true;
    }
}
