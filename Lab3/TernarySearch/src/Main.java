public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int target = 5;
        System.out.println("Искомый элемент: " + target);
        int result = TernarySearch.ternarySearch(arr, target);
        System.out.println("Индекс " + target + " ---> " + result);
    }
}