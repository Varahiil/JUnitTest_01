package by.itstep.java1022.zhukov.model.logic;

public class Vector {

    public static boolean isVectorSort(int[] array) {
        if (array.length < 2) {
            return false;
        } else if (array.length == 2) {
            return true;
        }
        return vectorSortUp(array) || vectorSortDown(array);
    }

    public static boolean vectorSortUp(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean vectorSortDown(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVectorMirrorFromMiddle(int[] array) {
        if (array.length < 3) {
            return false;
        }
        int length = array.length;
        for (int i = 0; i < length / 2 ; i++) {
            if (array[i] != array[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVectorElementsUnique(int[] array) {
        if (array.length < 2) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] == array[i + j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String vectorCountEvenOdd(int[] array) {
        if (array.length < 1) {
            return "Value invalid";
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                if (array[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        return "Even " + even + "," + " Odd " + odd;
    }


    public static String vectorRating(int[] array) {

        if (countMark(array, -2) == -1) {
            return "Invalid value";
        }
        int fives = countMark(array, 5);
        int fours = countMark(array, 4);
        int triplets = countMark(array, 3);
        int deuces = countMark(array, 2);
        int units = countMark(array, 1);
        int zeros = countMark(array, 0);


        double fivesRate = rate(array, fives);
        double foursRate = rate(array, fours);
        double tripletsRate = rate(array, triplets);
        double deucesRate = rate(array, deuces);
        double unitsRate = rate(array, units);
        double zerosRate = rate(array, zeros);

        StringBuilder arPrint = arrayPrint(array);
        String msg = String.format("Exam Result Handling " + "\n"
                        + "Marks: " + arPrint + "\n"
                        + "Exam Result: " + "\n"
                        + "fives " + "%.1f" + "%% (%d)" + "\n"
                        + "fours " + "%.1f" + "%% (%d)" + "\n"
                        + "triplets " + "%.1f" + "%% (%d)" + "\n"
                        + "deuces " + "%.1f" + "%% (%d)" + "\n"
                        + "units " + "%.1f" + "%% (%d)" + "\n"
                        + "zeros " + "%.1f" + "%% (%d)", fivesRate, fives, foursRate, fours, tripletsRate,
                triplets, deucesRate, deuces, unitsRate, units, zerosRate, zeros);
        return msg;
    }


    public static double rate(int[] array, int num) {
        if (num == 0) {
            return 0;
        }
        return (double) num / array.length * 100;
    }

    public static int countMark(int[] array, int mark) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 || array[i] < 0) {
                return -1;
            }

            if (array[i] == mark) {
                count++;
            }
        }
        return count;
    }

    public static StringBuilder arrayPrint(int[] array) {
        StringBuilder print = new StringBuilder();
        for (int mass : array) {
            print.append(mass).append(" ");
        }
        return print;
    }
}