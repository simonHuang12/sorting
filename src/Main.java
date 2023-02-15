import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //Testing our random arrays
        System.out.println("Testing randomIntArr(10)");
        Integer[] testIntAr1 = SortUtils.randomIntArr(10);
        for (Integer val: testIntAr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("Testing randomStrArr(10)");
        String[] testStrAr1 = SortUtils.randomStrArr(10);
        for (String val: testStrAr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("Testing randomIntAL\n"+SortUtils.randomIntAL(10));
        System.out.println("Testing randomStrAL\n"+SortUtils.randomStrAL(10));
        System.out.println();

        ArrayList<Integer> test = SortUtils.randomIntAL(6);
        System.out.println(test);
        System.out.println(SortUtils.minIndex(3, test));
        SortUtils.swap(2, 5, test);
        System.out.println(test);
        System.out.println();

        ArrayList<String> test2 = SortUtils.randomStrAL(6);
        System.out.println(test2);
        System.out.println(SortUtils.minIndex(0, test2));
        SortUtils.swap(0, 5, test2);
        System.out.println(test2);
    }
}