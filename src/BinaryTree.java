
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

  
}
