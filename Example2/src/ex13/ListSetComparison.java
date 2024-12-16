package ex13;

public class ListSetComparison {

    public static void main(String[] args) {
    	//590p 13장 sec01.exam04
    	
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("A");
        list.add("A");
        list.add("B");

        set.add("A");
        set.add("A");
        set.add("B");

        list.add(null);
        set.add(null);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}
