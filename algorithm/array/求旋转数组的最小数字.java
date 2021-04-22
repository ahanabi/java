package array;

class MinInReversingList {
    public static int minInReversingList(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1 || array[array.length - 1] > array[0]) {
            return array[0];
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }
            if (array[mid - 1] > array[mid]) {
                return array[mid];
            }
            if (array[mid] > array[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}