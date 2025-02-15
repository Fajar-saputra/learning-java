package com.main;
import  java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] angkaRandom = {1,2,3,4,5,6,7,8,9,10};
        tampilIsi(angkaRandom);

        // copy
        int[] angkaCopy1 = Arrays.copyOf(angkaRandom, 5);
        tampilIsi(angkaCopy1);

        //copy dengan range
        int[] angkaCopy2 = Arrays.copyOfRange(angkaRandom, 5,10);
        tampilIsi(angkaCopy2);

        //fill array
        int[] angkaRandom2 = new int[5];
        Arrays.fill(angkaRandom2,5);
        tampilIsi(angkaRandom2);

        // membandingkan 2 array apakah sama
        System.out.println(Arrays.equals(angkaRandom2,angkaRandom));

        // sort arry
        int[] angkaRandom3 = {5,2,4,1,6,10,8,9,7};
        Arrays.sort(angkaRandom3);
        tampilIsi(angkaRandom3);

        // seacrh array terurut
        int tesSearch = 5;
        System.out.println("\nangka 5 ada di index : "+Arrays.binarySearch(angkaRandom3, tesSearch));

        // seacrh tanpa terurut
        int[] angkaRandom4 = {5,2,4,1,6,10,8,9,7,3};
        urutAscending(angkaRandom4);
        urutDescending(angkaRandom4);

        int[] angkaRandom5 = {5,2,4,1,6,10,8,9,7,3};
        bubbleSort(angkaRandom5);
        selectionSort(angkaRandom5);
        insertionSort(angkaRandom5);

        long[] arrayLong = {
                10,90,80,67,26
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

    }


    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }







    // seacrh tanpa terurut
    public static void urutDescending(int[] dataArray){
        int temp;
        System.out.println("Sebelum diurutkan: " + Arrays.toString(dataArray));

        for(int i = 0; i < dataArray.length; i++) {
            for(int j = i+1; j < dataArray.length; j++) {

                // Ubah kondisi ke `dataArray[i] < dataArray[j]` untuk urutan menurut
                if (dataArray[i] < dataArray[j]) {
                    temp = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = temp;
                }
            }
        }

        System.out.println("Setelah diurutkan: " + Arrays.toString(dataArray));
    }

    // seacrh tanpa terurut
    public static void urutAscending(int[] dataArray){
        int temp;
        System.out.println("Sebelum diurutkan: " + Arrays.toString(dataArray));

        for(int i = 0; i < dataArray.length; i++) {
            for(int j = i+1; j < dataArray.length; j++) {

                // Ubah kondisi ke `dataArray[i] > dataArray[j]` untuk urutan naik
                if (dataArray[i] > dataArray[j]) {
                    temp = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = temp;
                }
            }
        }

        System.out.println("Setelah diurutkan: " + Arrays.toString(dataArray));
    }

    public static void tampilIsi(int[] angka){
        System.out.println("\narray : "+ Arrays.toString(angka));
    }
}

