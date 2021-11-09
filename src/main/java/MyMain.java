import java.util.ArrayList;


public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int x = 0;
        for (String s : list) {
            if (s.startsWith("a") || s.startsWith("A")) {
                x++;
            }
        }
        return x;

    } // Adds a ! to each element in the ArrayList, returns an ArrayList

    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i : list1) {
            for (int j : list2) {
                if (j == i) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int x = 0;
        for (Integer i : list) {
            if (i % 2 != 0) {
                x++;
            }
        }
        return x;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        // REPLACE WITH YOUR E
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int len1 = list1.size();
        int len2 = list2.size();
        ArrayList<Integer> fin = new ArrayList<>();

        // ArrayList<Integer> fin = IntStream.range(0, len1 + len2).<Integer>mapToObj(z -> null).collect(Collectors.toCollection(ArrayList::new));
        // that is what java suggested when refactoring. apparently equiv to for loop below
        for (int z = 0; z < len1 + len2; z++) {
            fin.add(null);
        }
        // i have had questions like this  before, but never with a list, so there is probably a better way to do this

        while (i < len1 && j < len2) {
            if (list1.get(i) < list2.get(j)) {
                fin.set(k, list1.get(i));
                k++;
                i++;
            } else {
                fin.set(k, list2.get(j));
                k++;
                j++;
            }
        }

        while (i < len1) {
            fin.set(k, list1.get(i));
            k++;
            i++;
        }

        while (j < len2) {
            fin.set(k, list2.get(j));
            k++;
            j++;
        }
        return fin;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
