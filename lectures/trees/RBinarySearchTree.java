public class RBinarySearchTree
{
    TreeNode root = null;
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private TreeNode insert(TreeNode node, int data)
    {
        if (node == null)
            node = new TreeNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    /* Function to insert data recursively */
    private TreeNode delete(TreeNode root, int data)
    {
        if (root == null)
            return root;
        else
        {
            if (root.data > data)
                root.left = delete(root.left, data);
            else if(root.data < data)
                root.right = delete(root.right, data);
            else
            {
                if(root.left == null)
                    return root.right;
                if(root.right == null)
                    return root.left;

                TreeNode successor = getSuccessor(root);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    private TreeNode getSuccessor(TreeNode current)
    {
        current = current.right;
        while(current != null && current.left != null)
        {
            current = current.left;
        }
        return current;
    }

    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(TreeNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    public static void main(String[] args)
    {
        RBinarySearchTree rTree = new RBinarySearchTree();

        rTree.insert(10);
        rTree.insert(24);
        rTree.insert(25);
        rTree.insert(0);

        System.out.println(rTree.search(25));
        System.out.println(rTree.search(256));

        rTree.delete(rTree.root, 10);

        System.out.println(rTree.search(10));
    }
}
