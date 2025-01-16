import java.util.ArrayList;

public class ListService {
    public static void main(String[] args){
        ListService listService=new ListService();
        listService.newArray();
    }
    public void newArray() {
        ArrayList list1 = new ArrayList();

        //Below list is called as rawlist or rawArray
        list1.add(10);
        list1.add("Hello");
        list1.add(true);
        list1.add(7.2f);
        list1.add("Good");
//we can use a wrapper type like Object explicitly if we want to add int, string, boolean
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(11);
        list2.add("Hello1");
        list2.add(true);
        list2.add(7.2f);
        list2.add("Good1");
// Object is the root class of all classes in Java.
// Every class in Java (e.g., String, Integer, Boolean, etc.) directly or
// indirectly inherits from the Object class.
//        The loop processes:
//
//        First iteration: obj = 10 (an Integer object).
//        Second iteration: obj = "Hello" (a String object).
//        Third iteration: obj = true (a Boolean object).
//        Fourth iteration: obj = 7.2f (a Float object).
//        Fifth iteration: obj = "Good" (a String object).

        for (Object obj : list1) {
            System.out.println(obj);
        }
        for (Object obj : list2) {
            System.out.println(obj);
        }
        // this is parameteried ArrayList
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(2);
        list3.add(4);
        for (Integer element : list3)
            System.out.println(element);

//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);
    }
}
