
public class LinkedList {
    Element first;
    int size = 0;

    public LinkedList(Element first, int size) {
        super();
        this.first = first;
        this.size = size;
    }

    public void append(String x) {
        Element temp = new Element(x, null);
        if (first == null) {
            first = temp;
            size++;
        } else {
            temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            Element temp1 = new Element();
            temp1.element = x;
            temp1.next = null;
            temp.next = temp1;
            size++;
        }
    }
    public void prepend(String x) {
        Element temp = new Element(x, null);
        temp.next = first;
        first = temp;
        size++;
    }
    public void remove(int x) {
        Element temp = new Element(null, null);
        Element temp1 = new Element(null, null);
        temp = first;
        for (int i = 0; i < x; i++) {
            temp = temp.next;
            if (i == x - 2) {
                temp1 = temp;
            }
        }
        temp1.next = temp.next;
        size--;
    }
    @Override public String toString() {
        Element temp = new Element(null, null);
        String text = "";
        temp = first;
        for (int i = 0; i < size; i++) {
            text += "[" + temp.element + "]";
            temp = temp.next;
        }
        return text;
    }
}