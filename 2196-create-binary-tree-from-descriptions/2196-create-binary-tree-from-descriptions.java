class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> mp = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] arr : descriptions) {

            int par = arr[0];
            int chil = arr[1];
            int isLeft = arr[2];

            mp.putIfAbsent(par, new TreeNode(par));
            mp.putIfAbsent(chil, new TreeNode(chil));

            TreeNode parent = mp.get(par);
            TreeNode child = mp.get(chil);

            if (isLeft == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            children.add(chil);
        }

        for (int[] arr : descriptions) {
            int parent = arr[0];

            if (!children.contains(parent)) {
                return mp.get(parent);
            }
        }

        return null;
    }
}