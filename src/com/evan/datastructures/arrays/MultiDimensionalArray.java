package com.evan.datastructures.arrays;

public class MultiDimensionalArray {
    private int[][] numbers;

    public MultiDimensionalArray(int rows, int columns) {
        numbers = new int[rows][columns];
    }

    public void initializeArray() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (i + j) * 2;  // Example initialization
            }
        }
    }

    public void displayArray() {
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public int sumOfElements() {
        int sum = 0;
        for (int[] row : numbers) {
            for (int number : row) {
                sum += number;
            }
        }
        return sum;
    }

    // Additional methods adapted for a 2D array

    // Traverses a 2D array and performs an action on each element
    public static void traverse(int[][] array) {
        // Method logic
    }

    // Searches for a specific value in a 2D array and returns its position
    public static int[] search(int[][] array, int value) {
        return new int[]{-1, -1}; // Returning -1, -1 if not found
    }

    // Sorts each row of a 2D array in ascending order
    public static void sort(int[][] array) {
        // Method logic
    }

    // Copies one 2D array to another
    public static void copy(int[][] source, int[][] destination) {
        // Method logic
    }

    // Compares two 2D arrays for equality
    public static boolean compare(int[][] array1, int[][] array2) {
        return false; // Method logic
    }

    // Finds the maximum value in a 2D array
    public static int findMax(int[][] array) {
        return 0; // Method logic
    }

    // Finds the minimum value in a 2D array
    public static int findMin(int[][] array) {
        return 0; // Method logic
    }

    // Additional methods using the Arrays and System classes can be added as needed
}

