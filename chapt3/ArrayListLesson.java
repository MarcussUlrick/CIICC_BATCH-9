package chapt3;

import java.util.*;


public class ArrayListLesson {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("no gen");
        System.out.println(list1);
//add is a boolean element
         ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(5);
        list2.add(87);
        list2.add(52);

        System.out.println(list2.add(2));
                list2.add(0,11);
        System.out.println(list2);
//////////////////////////////////////////////////////////


/** Wrapper Classes - converts back to primitive
 * boolean = Boolean
 * byte = Byte
 * short = Short
 * 
*/

//parse = primitive
// valueOf = string

        int q = 10;
        Integer w = 20;
        w.byteValue();
        System.out.println(w);

        List nums = new ArrayList<>();
        nums.add(1); nums.add(2);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);

        List nums2 =Arrays.asList(8,7,2,3,4,1,9,5,6);
        Collections.sort(nums2); // arranging arrays
        System.out.println(nums2);
        List list3 = new ArrayList<>(nums2); // copy/duplicate
        Collections.reverse(nums2); // reversing arrays
        System.out.println(nums2);
        Collections.shuffle(nums2); // shuffle arrays
        System.out.println(nums2);
        System.out.println(list3);
    }
    
}
