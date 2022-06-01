package lesson4;

import java.util.*;

public class ArrayExamples {

    public void stringArray() {
        String[] buttons = {"OK", "Cancel", "login", "SignUp"};
//        buttons[2] = "Exit";
//        int length = buttons.length;
//        System.out.println("length: " + length);
        System.out.println(buttons[2]);

//        for (int i = 0; i < length; i++) {
//            System.out.println(buttons[i]);
//        }
//        for (String button : buttons) {
//            System.out.println(button);

        int[] ids = {12, 5, 8, 32};
        System.out.println(ids[3]);
    }
//    }

    public void stringArrayWithSize() {
        String[] array = new String[5];
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SignUp";
        array[4] = "Exit";

        System.out.println("length: " + array.length);

    }

    public void intArray() {
        int[] ids = {12, 3, 5, 8};
        System.out.println(ids[2]);
    }

    public void arrayListExample() {

        ArrayList<String> buttons = new ArrayList<String>();

        buttons.add("OK");
        buttons.add("Login");
        buttons.add("Cancel");
        buttons.add("Exit");
        System.out.println(buttons.get(0));

        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }
        for (String button : buttons) {
            System.out.println();
        }
        System.out.println("The size of the list is: " + buttons.size());
        buttons.add("SighUp");
        for (String button : buttons) {
            System.out.println(button);
        }
        buttons.remove("Exit");
        for (String button : buttons) {
            System.out.println(button);
        }
        buttons.clear();
        System.out.println(buttons.size());
        System.out.println("The size of the list is: " + buttons.size());
    }

    public void arrayListSortingExample() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(4675);
        arrayList.add(56);
        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public void hashMapExample(int[] arr) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Kyiv");
        hashMap.put("Moshe", "Tel-Aviv");
        System.out.println(hashMap);

        System.out.println(hashMap.get("Moshe"));
        hashMap.remove("John");
        System.out.println(hashMap.size());

    }

    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }

    public void test() {

        ArrayList<String> result = new ArrayList<String>();
        result.add("cat");
        result.add("dog");

        System.out.println(result.get(2));
    }
}


