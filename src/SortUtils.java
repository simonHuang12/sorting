import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
/** Static methods for aiding in the creation of sorting algorithms */
public class SortUtils
{
    /** Add static int that counts memory accesses*/
    private static int memAccess = 0;

    /** Add static int that counts comparisons */
    private static int comparisons = 0;
    /** Add public static getters and setters for both 

     /** Checks if an array of integers is non-descending order */
    public static boolean isSorted(ArrayList<Integer> intArr)
    {
        return false;
    }
    public static int getMemAccess() {
        return memAccess;
    }
    public static void setMemAccess(int memAccess) {
        SortUtils.memAccess = memAccess;
    }
    public static int getComparisons() {
        return comparisons;
    }
    public static void setComparisons(int comparisons) {
        SortUtils.comparisons = comparisons;
    }
    /** Checks if an array of String is non-descending order */
    public static boolean isSortedStr(String[] strArr)
    {
        return false;
    }
    /** Creates a random Array of Integers of a given length */
    public static Integer[] randomIntArr(int len)
    {
        //Keeping things simple 0 to 99
        Integer[] retArr = new Integer[len];
        for (int i = 0; i < len; i++)
        {
            retArr[i] = (int) (Math.random()*100);
        }
        return retArr;
    }
    /** Creates a random ArrayList of Strings of a given length */
    public static String[] randomStrArr(int len)
    {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //Keeping things simple a to z
        String[] retArr = new String[len];
        for (int i = 0; i < len; i++)
        {
            int randomInd = (int) (Math.random()*26);
            retArr[i] = letters.substring(randomInd,randomInd+1);
        }
        return retArr;
    }
    /** Creates a random ArrayList of Integers of a given length */
    public static ArrayList<Integer> randomIntAL(int len)
    {
        return new ArrayList<Integer>(Arrays.asList(randomIntArr(len)));
    }
    /** Creates a random ArrayList of Integers of a given length */
    public static ArrayList<String> randomStrAL(int len)
    {
        return new ArrayList<String>(Arrays.asList(randomStrArr(len)));
    }
    /** Finds the minimum starting at index i **/
     public static int minIndex(int i, ArrayList arrayList){
        int minIdx = i;
        for (int j = i; j < arrayList.size(); j++){
            if (String.valueOf(arrayList.get(j)).compareTo(String.valueOf(arrayList.get(minIdx))) < 0){
                minIdx = j;
            }
        }
        return minIdx;
    }
    /** Swaps the elements at index i and j **/
    public static void swap(int i, int j, ArrayList arrayList){
        String old = String.valueOf(arrayList.set(i, arrayList.get(j)));
        arrayList.set(j, old);
    }
}