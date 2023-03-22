package lesson3;

import java.util.Arrays;

public class Vector {
    private int n; // размерность пространства
    private int[] vector = new int[n];

    public int getN() {
        return n;
    }
    public int[] getVector() {
        return vector;
    }

    public Vector(int n, int[] vector) {
        if (n <= 0) {
            this.n = -1;
            int[] tempArray = {};
            this.vector = tempArray;
            System.out.println(("exception: dimension (n) can't be negative"));
        }
        else {
            this.n = n;
            this.vector = vector;
        }
    }

    public int[] scalarProduct (int[] secondVector) {
        int[] scalarProductValue = new int[0];
        if (exceptionHandling(secondVector)) {
            int[] tempValue = new int[1];
            tempValue[0] = 0;
            scalarProductValue = tempValue;
            for (int i = 0; i <= n - 1; i++) {
                scalarProductValue[0] += vector[i] * secondVector[i];
            }
        }
        return scalarProductValue;
    }

    public int[] additionVector (int[] secondVector) {
        int[] additionVectorList = new int[0];
        for (int i = 0; i <= n - 1; i ++) {
            additionVectorList[i] = vector[i] + secondVector[i];
        }
        return additionVectorList;
    }

    public int[] substractionVector (int[] secondVector) {
        int[] substractionVectorList = new int[n];
        for (int i = 0; i <= n - 1; i ++) {
            substractionVectorList[i] = vector[i] - secondVector[i];
        }
        return substractionVectorList;
    }

    public int[] vectorProduct (int[] secondVector) {
        int[] vectorProductList = new int[n];
        if (n != 3) {
            int[] emptyArray = new int[0];
            vectorProductList = emptyArray;
            System.out.println("impossible, both dimensions should be equal 3");
            return emptyArray;
        } else if (n == secondVector.length) {
            int[] a = vector;
            int[] b = secondVector;
            vectorProductList[0] = a[1] * b[2] - a[2] * b[1];
            vectorProductList[1] = a[2] * b[0] - a[0] * b[2];
            vectorProductList[2] = a[0] * b[1] + a[1] * b[0];
        }
        return vectorProductList;
    }

    private boolean exceptionHandling(int[] secondVector) {
        if (n == -1) {
            System.out.println("first vector does not exist (n < 0)");
            return false;
        } else if (n != secondVector.length) {
            System.out.println("dimensions of vectors are diff");

            return false;
        }
        return true;
    }
}
