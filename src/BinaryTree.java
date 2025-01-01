public class BinaryTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeIS {
        static int idx = -1;

        public static Node binaryTreeInsertion(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryTreeInsertion(nodes);
            newNode.right = binaryTreeInsertion(nodes);
            return newNode;
        }

        // PreorderTraversals
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTreeIS tree = new BinaryTreeIS();
            Node root = tree.binaryTreeInsertion(nodes);
            preOrder(root);
        }
    }
}

