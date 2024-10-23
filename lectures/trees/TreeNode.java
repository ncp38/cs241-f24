public class TreeNode
{
    public TreeNode left;
    public TreeNode right;

    int data;

    /* Constructor */
    public TreeNode()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public TreeNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeft(TreeNode n)
    {
        left = n;
    }
    /* Function to set right node */
    public void setRight(TreeNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public TreeNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public TreeNode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }
}
