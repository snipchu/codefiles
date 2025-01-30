import java.lang.*;

public class TreeNode
{
  private Comparable treeNodeValue;
  private TreeNode leftTreeNode;
  private TreeNode rightTreeNode;
  public static void main(String[] args) {
    TreeNode root = new TreeNode(90, new TreeNode(80, new TreeNode(70), new TreeNode(85)), new TreeNode(100, new TreeNode(98), new TreeNode(120)));
    System.out.println("IN ORDER\n"+root.inOrder());
    System.out.println("\nPRE ORDER\n"+root.preOrder());
    System.out.println("\nPOST ORDER\n"+root.postOrder());
    System.out.println("\nREVERSE ORDER\n"+root.revOrder());
    System.out.println("\n*Tree height is "+root.getHeight());
    System.out.println("*Tree diameter is "+root.getDiameter());
    System.out.println("*Tree width is "+root.getWidth());
    System.out.println("Number of leaves is "+root.getNumLeaves());
    System.out.println("Number of nodes is "+root.getNumNodes());
    System.out.println("*Number of levels is "+root.getNumLevels());
    System.out.println("Tree as a string is "+root.toString());
    System.out.println(root.isFull()?"The tree is full.":"The tree is not full.");
    System.out.println(root.contains(100)?"The tree has 100.":"The tree doesnt have 100.");
    System.out.println(root.contains(114)?"The tree has 114.":"The tree doesnt have 114.");
    System.out.println("The smallest node is "+root.getSmallest());
    System.out.println("The largest node is "+root.getLargest());
    System.out.println("\noriginal tree\n"+root.preOrder());
    root.delete();
    System.out.println("\n*remove 90\n"+root.preOrder());
    System.out.println("\n* unfinished");
  }
  public TreeNode() {
    treeNodeValue = null;
    leftTreeNode = null;
    rightTreeNode = null;
  }
  public TreeNode(Comparable value) {
    treeNodeValue = value;
    leftTreeNode = null;
    rightTreeNode = null;
  }
  public TreeNode(Comparable value, TreeNode left, TreeNode right) {
    treeNodeValue = value;
    leftTreeNode = left;
    rightTreeNode = right;
  }
  public Comparable getValue() { return treeNodeValue; }
  public TreeNode getLeft() { return leftTreeNode; }
  public TreeNode getRight() { return rightTreeNode; }
  public void setValue(Comparable value) { treeNodeValue = value; }
  public void setLeft(TreeNode left) { leftTreeNode = (TreeNode)left; }
  public void setRight(TreeNode right) { rightTreeNode = (TreeNode)right; }
  public String preOrder() {
    String result = getValue() + " ";
    result += (getLeft() != null) ? getLeft().preOrder():"";
    result += (getRight() != null) ? getRight().preOrder():"";
    return result;
  }
  public String postOrder() {
    String result = "";
    result += (getLeft() != null) ? getLeft().postOrder():"";
    result += (getRight() != null) ? getRight().postOrder():"";
    result += getValue() + " ";
    return result;
  }
  public String inOrder() {
    String result = "";
    result += (getLeft() != null) ? getLeft().inOrder():"";
    result += getValue() + " ";
    result += (getRight() != null) ? getRight().inOrder():"";
    return result;
  }
  public String revOrder() {
    String result = "";
    result += (getRight() != null) ? getRight().revOrder():"";
    result += getValue() + " ";
    result += (getLeft() != null) ? getLeft().revOrder():"";
    return result;
  }
  public int getNumLeaves() {
    int result = 0;
    if (getLeft() != null)
      result += getLeft().getNumLeaves();
    if (getRight() != null)
      result += getRight().getNumLeaves();
    if (getLeft()==null && getRight()==null)
      result++;
    return result;
  }
  public int getNumLevels() {
    int result = 0;
    if (isFull()) {return getNumNodes()/2;}
    return 1; // do this later
  }

  public int getDiameter() {return 0;}
  public int getWidth() {return 0;}
  public int getHeight() { return getNumLevels()-1;}
  public int getNumNodes() {
    int result = 1;
    result += (getLeft() != null) ? getLeft().getNumNodes():0;
    result += (getRight() != null) ? getRight().getNumNodes():0;
    return result;
  }
  public String toString() { return inOrder(); }
  public boolean isFull() {
    if (getRight()!=null && getLeft()!=null)
      return getRight().isFull() && getLeft().isFull();
    else if (getRight()==null && getLeft()==null)
      return true;
    else
      return false;
  }
  public Comparable getLargest() {
    if (getRight()==null && getLeft()==null)
      return getValue();
    else if (getRight()!=null)
      return getRight().getLargest();
    else
      return getLeft().getLargest();
  }
  public Comparable getSmallest() {
    if (getRight()==null && getLeft()==null)
      return getValue();
    else if (getLeft()!=null)
      return getLeft().getSmallest();
    else
      return getRight().getSmallest();
  }
  public boolean contains(Comparable node) {
    if (getRight()==null && getLeft()==null)
      return false;
    else if (getLeft().getValue().equals(node) || getRight().getValue().equals(node))
      return true;
    else if (getLeft()!=null)
      return getLeft().contains(node);
    else
      return getRight().contains(node);
  }
  public void delete() {
    setValue(null);
    if (getRight()!=null) {
      setValue(getRight().getValue());
      getRight().delete();
    } else if (getLeft()!=null) {
      setValue(getLeft().getValue());
      getLeft().delete();
    }
  }
}
