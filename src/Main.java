
public class Main {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(null, 0);

        l1.append("is a");
        l1.append("linked");
        l1.append("array");
        l1.append("list");
        l1.prepend("this");
        l1.remove(3);
        System.out.println(l1.toString());
    }
}