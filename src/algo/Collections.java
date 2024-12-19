package algo;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Collections {

    public static <T extends Comparable<T>> int binarySearchCommon(int leftIndex, int rightIndex, Function<Integer, T> getElement, T key, Comparator<T> comparator) {
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            T mid = getElement.apply(midIndex);
            int compareValue = comparator.compare(mid, key);

            if (compareValue == 0) {
                return midIndex; // Найден элемент
            } else if (compareValue < 0) {
                leftIndex = midIndex + 1; // Поиск в правой половине
            } else {
                rightIndex = midIndex - 1; // Поиск в левой половине
            }

        }

        return -1;
    }

    static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        return binarySearchCommon(0, list.size(), list::get, key, T::compareTo);
    }

    static <T extends Comparable<T>> int binarySearch(List<T> list, T key, Comparator<T> c) {
        return binarySearchCommon(0, list.size(), list::get, key, c);
    }
}
