package java_0916;

public class ArrayList {

    //数组逆序排列
    public static void reverse(int[] arr) {//hf
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    //冒泡排序法,降序排列。
    public static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length - 1; bound++) {
            for (int cur = 0; cur < arr.length - bound - 1; cur++) {
                if (arr[cur] < arr[cur + 1]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[cur + 1];
                    arr[cur + 1] = tmp;
                }

            }
        }
    }

    //二分查找法找元素。
    public static int binarySearch(int[] arr, int toFind){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(toFind < arr[mid]){
                right = mid-1;
            }else if(toFind > arr[mid]){
                left = mid+1;
            }else {
                return arr[mid];
            }
        }
        return -1;
    }
}
