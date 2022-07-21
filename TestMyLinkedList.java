public class TestMyLinkedList {
    public static void main(String[] args) {
        // Create a list for strings
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("Santa");
        list.add("Teller");
        list.add("Jane");
        list.add("Mayolo");
        list.add("Jack");
        list.add("Mario");
        list.add("Jose");
        list.add("Jake");
        list.add("Megan");
        list.add("Peter");

        System.out.println("Original List:");
        System.out.println(list + "\n");

        System.out.println("Removing head node: ");
        list.removeFirst();
        System.out.println(list + "\n");

        System.out.println("Removing tail node: ");
        list.removeLast();
        System.out.println(list + "\n");

        System.out.println("Get head of list: " + list.getFirst());

        System.out.println("Get Tail of list: " + list.getLast() + "\n");

        list.addFirst("Jacob");
        System.out.println("Add to head: " + list);

        list.addLast("Samantha");
        System.out.println("Add to tail: " + list + "\n");

        System.out.println("Does the list contain Mayolo? " + list.contains("Mayolo"));
        System.out.println("Where is Mayolo's name in the list? " + list.indexOf("Mayolo"));
        System.out.println("where is the last occurrence of Mayolo's name? " + list.lastIndexOf("Mayolo"));

        System.out.println("\nWho's name is in index 5? " + list.get(5));

        System.out.println("\nUsing the clear() method. ");
        list.clear();
        System.out.println(list.toString());
        System.out.println("List is now cleared.");
    }
}