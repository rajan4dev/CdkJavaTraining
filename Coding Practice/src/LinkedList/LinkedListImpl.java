package LinkedList;

/**
 * Created by bhirudr on 10/30/2017.
 */
public class LinkedListImpl<E> {
    int size = 0;

    Node<E> first;
    Node<E> last;

    public int getSize() {
        return size;
    }

    public E getFirst() {
        return first.item;
    }

    public E getLast() {
        return last.item;
    }

    public LinkedListImpl() {
    }

    /*Adding Node To Linked List*/
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public void printList() {
        System.out.println("Printing Linked List: ");
        if (size == 0) {
            System.out.println("Empty!\n");
            return;
        }
        Node<E> currentNode = first;
        System.out.print("[ ");
        while (currentNode.next != null) {
            System.out.print(currentNode.item + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.item + " ]");
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean delete(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
}
