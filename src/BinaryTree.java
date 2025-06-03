
import java.util.Comparator;

public class BinaryTree<T> {

  // Node class representing each node in the binary tree
  static class Node<T> {
    T value;
    Node<T> leftTree;
    Node<T> rightTree;

    // Constructor creating a node with a value
    Node(T val) {
      value = val;
      leftTree = null;
      rightTree = null;
    }

    // Constructor creating a node with a value and left/right children
    Node(T val, Node<T> left, Node<T> right) {
      value = val;
      leftTree = left;
      rightTree = right;
    }
  }

  private Node<T> root;
  private Comparator<T> comparator;
  private int size;

  // Constructs a empty binary tree
  public BinaryTree(Comparator<T> c) {
    root = null;
    comparator = c;
    size = 0;
  }

  // Adding a Node to the binary tree
  public void add (T item) { }
  private void add(Node<T> tree, Node<T> newNode) { }

  public void remove(T item) { }
  private void remove(Node<T> tree, T item) { }

  public boolean contains(T item) { }
  private boolean contains(Node<T> tree, T item) { }

  public boolean isEmpty() { }

  public int size() { }

  public void print() { }
  private void print(Node<T> node) { }







  
}
