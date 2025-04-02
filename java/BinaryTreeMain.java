import static java.lang.System.*;
import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        // put your name on it
        System.out.println("Binary Search Tree written by Helen Zhou");
        System.out.println();
        System.out.println();

        // create a new BinaryTree object
        BinaryTree tree = new BinaryTree();

        tree.add(new Data("Don", "Adams", "34257", 55));
        System.out.println("======================");
        System.out.println(tree);
        System.out.println("======================");

        tree.add(new Data("Sue", "Smart", "47888", 99));
        System.out.println("======================");
        System.out.println(tree);
        System.out.println("======================");

        tree.add(new Data("Bill", "Gates", "25788", 100));
        System.out.println("======================");
        System.out.println(tree);
        System.out.println("======================");
        
        tree.add(new Data("Dwayne", "Johnson", "15788", 100));
        System.out.println("======================");
        System.out.println(tree);
        System.out.println("======================");


        tree.add(new Data("Matthew", "Stafford", "15700", 95));
        System.out.println("======================");
        System.out.println(tree); 
        System.out.println("======================");


        tree.add(new Data("Elon", "Musk", "25800", 99));
        System.out.println("======================");
        System.out.println(tree); 
        System.out.println("======================");


        tree.add(new Data("Zoe", "Saldana", "47870", 100));
        System.out.println("======================");
        System.out.println(tree);
        System.out.println("======================");


        tree.add(new Data("Sundar", "Pichai", "47900", 95));
        System.out.println("======================");
        System.out.println(tree); 
        System.out.println("======================");

        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("Size: " + tree.size()); 
        System.out.println("++++++++++++++++");

        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("Nodes: " + tree.countNumberOfNodes());
        System.out.println("++++++++++++++++");

        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("Smallest ID: \n" + tree.getSmallestID());
        System.out.println("++++++++++++++++");

        System.out.println();
        System.out.println("++++++++++++++++");
        System.out.println("Largest ID: \n" + tree.getLargestID());
        System.out.println("++++++++++++++++");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the ID of whom you want info on: ");
            String id = input.nextLine().trim();
            if (id.equals("")) {
                break;
            }
            String output = tree.binarySearch(id);
            System.out.println(output);
            System.out.println();
        }
        System.out.println("++++++++++++++++");
        System.out.println("++++++++++++++++");
    }
}

class BinaryTree {
    private Node root;
    String output = "";

    public BinaryTree() {
        root = null;
    }

    public void add(Data data) {
        Node node = new Node(null, data, null);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while (current != null) {
            String theCurrentID = current.getData().getID();
            String theNodeID = node.getData().getID();
            if (theNodeID.equals(theCurrentID)) {
                System.out.println("Error, duplicate entry.");
            } else if (theNodeID.compareTo(theCurrentID) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    return;
                } else {
                    current = current.getLeft();
                }
            } else {
                if (current.getRight() == null) {
                    current.setRight(node);
                    return;
                } else {
                    current = current.getRight();
                }
            }
        }
    }

    private int countNodes(Node tree) {
        if (tree == null) return 0;
        return 1 + countNodes(tree.getLeft()) + countNodes(tree.getRight());
    }

    public int countNumberOfNodes() {
        return countNodes(root);
    }

    public int size() {
        return root == null ? 0 : countNodes(root);
    }

    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.getLeft());
        output += root.getData().toString() + "\n";
        inOrderTraversal(root.getRight());
    }

    public Data smallestID(Node tree) {
        if (tree == null) return null;
        if (tree.getLeft() == null) return tree.getData();
        return smallestID(tree.getLeft());
    }

    public Data getSmallestID() {
        return smallestID(root);
    }

    public Data largestID(Node tree) {
        if (tree == null) return null;
        if (tree.getRight() == null) return tree.getData();
        return largestID(tree.getRight());
    }

    public Data getLargestID() {
        return largestID(root);
    }

    public String binarySearch(String id) {
        Node tree = root;
        while (tree != null) {
            if (tree.getData().getID().equals(id)) {
                return tree.getData().toString();
            }
            tree = id.compareTo(tree.getData().getID()) < 0 ? tree.getLeft() : tree.getRight();
        }
        return "No id found.";
    }

    public String toString() {
        if (root == null) return "[]";
        output = "[\n";
        inOrderTraversal(root);
        return output + "]";
    }
}

class Node {
    private Data data;
    private Node left;
    private Node right;

    public Node(Node left, Data data, Node right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public Data getData() { return data; }
    public Node getLeft() { return left; }
    public void setLeft(Node left) { this.left = left; }
    public Node getRight() { return right; }
    public void setRight(Node right) { this.right = right; }
}

class Data {
    private String firstName;
    private String lastName;
    private String id;
    private double gpa;

    public Data(String firstName, String lastName, String id, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gpa = gpa;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getID() { return id; }
    public double getGPA() { return gpa; }

    public String toString() {
        return "ID=" + id + "  " + firstName + " " + lastName + "  gpa=" + gpa;
    }
}
