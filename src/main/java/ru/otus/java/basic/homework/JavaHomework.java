package ru.otus.java.basic.homework;

public class JavaHomework {
    public  int[] newArrayOne(int[] arrIn) {
        int desiredPosition = -1;
        for (int i = arrIn.length - 1; i > 0; i--) {
            if (arrIn[i] == 1) {
                desiredPosition = i;
                break;
            }
        }

        if (desiredPosition == -1) {
            throw new RuntimeException("Нет числа 1 в массиве");
        }

        int newSize = arrIn.length - desiredPosition - 1;
        int newArrayPosition = 0;
        int[] arrOut = new int[newSize];

        for (int i = desiredPosition + 1; i < arrIn.length; i++) {
            arrOut[newArrayPosition] = arrIn[i];
            newArrayPosition++;
        }
        return arrOut;
    }

    public boolean arrCheck(int[] arrIn) {
        boolean one = false;
        boolean two = false;
        for (int i : arrIn) {
            if (i != 1 && i != 2) {
                return false;
            }
            if (i == 1 && one == false) {
                one = true;
            }
            if (i == 2 && two == false) {
                two = true;
            }
        }
        return one && two;
    }
}