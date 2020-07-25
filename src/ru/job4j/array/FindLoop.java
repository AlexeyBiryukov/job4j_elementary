package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; finish < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int rst = indexOf(new int[]{0, 1, 2, 3, 4, 5}, 4);
        for (int index = 0; index < rst; index++) {
            System.out.println(rst);
        }
    }
}


