package kegiatan2;

public class sortingLinkedList {
    class Node {
        int data;

        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node first, last;

    public void addData(int dataBaru) {

        Node nodeBaru = new Node(dataBaru); // 1. buat node baru

        if (first == null) { // jika node masih kosong
            first = last = nodeBaru;
        } else { // jika node sudah ada
            last.next = nodeBaru;
            nodeBaru.prev = last;
            last = nodeBaru;
        }

    }

    public void sortLinkedList() {
        Node current = first, index;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {

                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }

    }

    public void printAll() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}

class data {
    public static void main(String[] args) {

        sortingLinkedList sorting = new sortingLinkedList();

        sorting.addData(8);
        sorting.addData(7);
        sorting.addData(1);
        sorting.addData(4);
        sorting.addData(6);
        sorting.addData(2);
        sorting.addData(3);

        System.out.print("Before : ");
        sorting.printAll();
        sorting.sortLinkedList();
        System.out.print("\nAfter Sort : ");
        sorting.printAll();
    }
}
