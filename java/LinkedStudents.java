import static java.lang.System.*;

// Horse class
class Horse {
    // instance variables (properties, attributes, fields)
    private String name;
    private double age;
    private double weight;

    // Constructor to initialize instance variables
    public Horse(String name, double age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public double getAge() {
        return age;
    }

    // Setter for age
    public void setAge(double age) {
        this.age = age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString method to format the horse's information
    public String toString() {
        return String.format("Name = %-10s      Age =%3.0f   Weight =%4.0f", getName(), getAge(), getWeight());
    }
} // end of class Horse


class Node<T> 
{
    private T data; // The generic data type
    private Node<T> next;
    private Node<T> previous;

    // Constructor to initialize instance variables
    public Node(Node<T> previous, T data, Node<T> next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    // Getter for data
    public T getData() {
        return data;
    }

    // Setter for data
    public void setData(T data) {
        this.data = data;
    }

    // Getter for next node
    public Node<T> getNext() {
        return next;
    }

    // Setter for next node
    public void setNext(Node<T> next) {
        this.next = next;
    }

    // Getter for previous node
    public Node<T> getPrevious() {
        return previous;
    }

    // Setter for previous node
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}

class LinkedList<T> 
{
    private Node<T> first;
    private Node<T> last;

    // Default constructor
    public LinkedList() {
        first = null;
        last = null;
    }

    // Method to get the current node at a specific index
    private Node<T> getCurrentNode(int index) {
        if (index < 0 || index >= size()) {
            return null; 
        }

        Node<T> current = first;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current;
            }
            count++;
            current = current.getNext();
        }
        return null;
    }

    // Method to set a new data at a specific index
    public T set(int index, T data) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Node<T> current = getCurrentNode(index);
        T oldData = current.getData();
        current.setData(data);
        return oldData;
    }

    // Method to remove the first node
    private T removeFrontItem() {
        Node<T> current = first;
        T data = current.getData();

        if (current == last) {
            first = null;
            last = null;
            return data;
        }

        if (current.getNext() == last) {
            first = last;
            first.setPrevious(null);
            return data;
        }

        first = first.getNext();
        first.setPrevious(null);
        return data;
    }

    // Method to remove the last node
    private T removeEndItem() {
        Node<T> current = last;
        T data = current.getData();

        if (current == first) {
            first = null;
            last = null;
            return data;
        }

        if (first.getNext() == last) {
            last = first;
            last.setNext(null);
            return data;
        }

        last = last.getPrevious();
        last.setNext(null);
        return data;
    }

    // Method to remove a node at a specific index
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        if (index == 0) {
            return removeFrontItem();
        }

        if (index == size() - 1) {
            return removeEndItem();
        }

        Node<T> current = getCurrentNode(index);
        T removedData = current.getData();
        Node<T> previousNode = current.getPrevious();
        Node<T> nextNode = current.getNext();

        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);

        return removedData;
    }

    // Method to add a node to the front
    public void addToFront(T data) {
        if (first == null) {
            add(data); 
            return;
        }  

        Node<T> node = new Node<>(null, data, first); 
        first.setPrevious(node); 
        first = node; 
    }

    // Method to add a node to the end
    public void addToEnd(T data) {
        add(data);
    }

    // Method to add a new node at the end
    public void add(T data) {
        Node<T> node = new Node<>(last, data, null);

        if (first == null) {
            first = node;
            last = node;
            return;
        }

        last.setNext(node);
        node.setPrevious(last);
        last = node;
    }

    // Method to get the size of the list
    public int size() {
        if (first == null) {
            return 0;
        }

        Node<T> current = first;
        int count = 0;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    // Method to print the list
    public void printList() {
        Node<T> current = first;
        int index = 0;

        while (current != null) {
            System.out.println("get(" + index + ") " + get(index));
            index++;
            current = current.getNext();
        }
        System.out.println();
    }

    // Method to get the data at a specific index
    public T get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Node<T> current = first;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            count++;
            current = current.getNext();
        }
        return null;
    }
    
    public Node<T> getFirst() {
    return first;
}

public Node<T> getLast() {
    return last;
}

    public String toString() {
        if (first == null) {
            return "[]";
        }

        StringBuilder output = new StringBuilder("[");
        Node<T> current = first;

        while (current != null) {
            output.append(current.getData().toString());

            if (current.getNext() == null) {
                output.append("]");
            } else {
                output.append(", ");
            }

            current = current.getNext();
        }

        return output.toString();
    }
}

public class LinkedStudents {
    public static void main(String[] args) {
        // put your name on it
        System.out.println("TestLinkedList (Horse) part 5 written by Helen Zhou");
        System.out.println();
        System.out.println();

        // creates a new LinkedList object
        LinkedList<Horse> list = new LinkedList<>();

        System.out.println();
        System.out.println("==== add and print =====");
        System.out.println();

        list.add(new Horse("Silver", 5, 988));
        list.add(new Horse("Mr. Ed", 6, 800));
        list.add(new Horse("Scout", 7, 850));
        list.add(new Horse("Trigger", 8, 740));
        list.add(new Horse("Buttermilk", 6, 720));

        System.out.println("size() returns " + list.size());

        System.out.println();
        System.out.println("***********************");
        System.out.println("***********************");

        // We will modify Mr. Ed 
        list.getFirst().getNext().getData().setName("Mister Ed");
        list.getFirst().getNext().getData().setAge(10);
        list.getFirst().getNext().getData().setWeight(999);

        list.printList();

        System.out.println();
        System.out.println();
    }
}
