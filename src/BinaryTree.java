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
  public void add (T item) { 
    add(root, new Node<T>)
  }

  // Helper method to add a new node to the binary tree
  private void add(Node<T> tree, Node<T> newNode) {
    // Check if the tree is empty
    if (root == null) {
        // If it is, set the new node as the root
        root = newNode;
        size++;
    // Check if the new nodes value is less than current nodes value, if it is, go left
    } else if (comparator.compare(newNode.value, tree.value) < 0) {
        if (tree.leftTree == null) {
            tree.leftTree = newNode;
            size++;
        } else {
            // Recurse on left side of tree
            add(tree.leftTree, newNode);
        }
    // New nodes value not less than current nodes, go right
    } else {
        // Check if the right child is null
        if (tree.rightTree == null) {
            tree.rightTree = newNode;
            size++;
        // Recurse on right side of tree
        } else {
            add(tree.rightTree, newNode);
        }
    }
  }
  


  // Removing a node from the binary tree
  public void remove(T item) { }
  private void remove(Node<T> tree, T item) { }

  public boolean contains(T item) { }
  private boolean contains(Node<T> tree, T item) { }

  public boolean isEmpty() { }

  public int size() { }

  public void print() { }
  private void print(Node<T> node) { }







  
}
