package org.telran.lecture_03_recursion.home_work;
public class Hanoi {
    // n: количество дисков
    // start: начальный столбец
    // end: конечный столбец
    // aux: вспомогательный столбец
    public static void hanoi(int n, String start, String end, String aux) {
        if (n == 0) return;
        hanoi(n - 1, start, aux, end);
        System.out.println(start + " go " + end);
        hanoi(n - 1, aux, end, start);
    }

    public static void main(String[] args) {
        hanoi(5, "A", "C", "B");
    }
}
