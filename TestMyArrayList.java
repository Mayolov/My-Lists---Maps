public class TestMyArrayList {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>(args);

        list.add("America");
        System.out.println(list);

        list.add(0, "canada");
        System.out.println(list);

        list.add("Russia");
        System.out.println(list);
        list.add("France");
        System.out.println(list);
        list.add(2, "Germany");
        System.out.println(list);
        list.add(5, "Norway");
        System.out.println(list);
        list.remove("Canada");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println();
        for (String s : list) {
            System.out.println(s.toUpperCase() + " ");
        }
    }

}
