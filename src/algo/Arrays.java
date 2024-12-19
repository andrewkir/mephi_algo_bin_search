package algo;

import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Byte::compareTo);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Byte::compareTo);
    }

    public static int binarySearch(char[] a, char key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Character::compareTo);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Character::compareTo);
    }

    public static int binarySearch(double[] a, double key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Double::compareTo);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Double::compareTo);
    }

    public static int binarySearch(float[] a, float key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Float::compareTo);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Float::compareTo);
    }

    public static int binarySearch(int[] a, int key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Integer::compareTo);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Integer::compareTo);
    }

    public static int binarySearch(long[] a, long key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Long::compareTo);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Long::compareTo);
    }

    public static int binarySearch(short[] a, short key) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, Short::compareTo);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, Short::compareTo);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] a, T key, Comparator<T> c) {
        return Collections.binarySearchCommon(0, a.length, index -> a[index], key, c);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        return Collections.binarySearchCommon(fromIndex, toIndex, index -> a[index], key, c);
    }
}
