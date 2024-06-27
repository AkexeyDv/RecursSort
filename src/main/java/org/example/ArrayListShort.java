package org.example;

import java.util.Arrays;

public class ArrayListShort {
    private Integer[] arrayList;
    private Integer lenActual;

    public ArrayListShort() {
        arrayList = new Integer[0];
        lenActual = 0;
    }

    public void add(Integer element) {
        if (lenActual == 0) {
            arrayList = new Integer[1];
            arrayList[0] = element;
        } else {
            arrayList[lenActual] = element;
        }
        lenActual++;

        if (lenActual == arrayList.length) {
            grow();
        }
    }
    public void sort(){
        Integer[] tmpArray=new Integer[lenActual];
        System.arraycopy(arrayList,0,tmpArray,0,lenActual);
        tmpArray=sorting(tmpArray);
        System.arraycopy(tmpArray,0,arrayList,0,lenActual);
    }
    private Integer[] sorting(Integer[] arraySort){
        if(arraySort.length==2){
            if(arraySort[0]>arraySort[1]){
                int tmp=arraySort[0];
                arraySort[0]=arraySort[1];
                arraySort[1]=tmp;
            }
        }
        if(arraySort.length>2){
            int separator=arraySort[arraySort.length-1];
            Integer[] leftArray=new Integer[arraySort.length];
            Integer[] rightArray=new Integer[arraySort.length];
            int leftIdx=0;
            int rightIdx=0;
            for (int i = 0; i < arraySort.length-1; i++) {
                if(arraySort[i]<separator){
                    leftArray[leftIdx]=arraySort[i];
                    leftIdx++;
                }else {
                    rightArray[rightIdx]=arraySort[i];
                    rightIdx++;
                }
            }
            Integer[] tmpLeft=leftArray;
            Integer[] tmpRight=rightArray;
            leftArray=new Integer[leftIdx];
            rightArray=new Integer[rightIdx];
            System.arraycopy(tmpLeft,0,leftArray,0,leftIdx);
            System.arraycopy(tmpRight,0,rightArray,0,rightIdx);
            System.out.println(Arrays.toString(leftArray)+"-left");
            System.out.println(Arrays.toString(rightArray)+"-right");
            sorting(leftArray);
            sorting(rightArray);
            System.arraycopy(leftArray,0,arraySort,0,leftArray.length);
            arraySort[leftArray.length]=separator;
            System.arraycopy(rightArray,0,arraySort,leftArray.length+1,rightArray.length);
            System.out.println(Arrays.toString(arraySort));
        }
        return arraySort;

    }

    private void grow() {
        Integer[] tmpArrayList = arrayList;
        if (lenActual > 1) {
            arrayList = new Integer[(int) (arrayList.length * 1.5)];
        } else {
            arrayList = new Integer[2];
        }

        System.arraycopy(tmpArrayList, 0, arrayList, 0, lenActual);
    }

    @Override
    public String toString() {
        String tempString = "[";
        for (int i = 0; i < lenActual; i++) {
            tempString = tempString+arrayList[i];
            if(i<lenActual-1){
                tempString=tempString+", ";
            }
        }
        tempString += "]";
        return tempString;
    }
}
