# Multi-Tree 多叉树（节点上可以附加自己的类从而可扩展用于决策树等使用场景 - based on JAVA）
Create and retrive multi-tree with TreeBuilder based on Java.

instruction：

1. 创建一个List
2. 初始化TreeNode(father-node-id, self-id) / TreeNode(father-node-id, self-id, name) / TreeNode(father-node-id, self-id, name, obj) 
   father-node-id, self-id - int：(id需为整数，并根据此id进行节点连接和判断大小，因此大小及长度有限制，新版本将支持字符串String)
   obj - Object：可附带在本节点上的对象，决策树中可附带带有判断程序的对象
   name - String：节点名称
3. 将每个TreeNode加入list，然后构造TreeBuilder(List)
4. 使用TreeBuilder.generateTree(); 建造多叉树。
5. 函数使用说明：
   1） addTreeNode(TreeNode treeNode) 向多叉树中添加节点。 TODO:存在疑问
   2） insertTreeNode(TreeNode treeNode) 插入节点。 TODO:存在疑问
   3） getTreeNodeById(TreeNode tree, int id) 工具函数：通过id查找给定树中的节点。
   4） getTreeNodeById(int id) 查找本树中的节点。
   5） toTree() / getRoot() 获取本树（返回根节点的引用）。
   6） isValidTree() 判断本树是否为一个合法的树（是否已连接好或者已有根节点）。
6. 如何遍历？
   1） 使用getTree().traverseDeepFirst() 层次遍历。 执行自定义操作目前只能自行更改for语句循环中的内容。TODO：新版本有待完善。
   2） 使用getTree().levelOrderTraversal() 深度优先遍历。 同上。
   3） 未进行优化，1使用递归遍历，2使用队列实现。TODO：目前并未对遍历速度进行优化。
7. TreeNode内函数使用说明（TODO：有待完善）。
