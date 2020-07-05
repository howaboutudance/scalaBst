package tech.hematite.scalabst

class Node(b: Any = None, l: Any = None, r: Any = None) {
  var left: Any = l
  var right: Any = r
  var root: Any = b

  def getLeft(): Any = {
    left
  }

  def setLeft(v: Int): Unit = {
    left = v
  }

  def setLeft(n: Node): Unit = {
    left = n
  }

  def getRight(): Any = {
    right
  }

  def setRight(v: Int): Unit = {
    right = v
  }

  def setRight(n: Node): Unit = {
    right = n
  }

  def getRoot(): Any = {
    root
  }

  def setRoot(v: Int): Unit = {
    root = v
  }

  def search(v: Int): Boolean = {
    if (root == None & left == None & right == None) {
      false
    } else if (v == root) {
      true
    } else if (v < root.asInstanceOf[Int]) {
      search(this.left, v)
    } else if (v > root.asInstanceOf[Int]) {
      search(this.right, v)
    } else {
      false
    }
  }

  def search(tree: Any, v: Int): Boolean = {
    tree match {
      case tree: Int  => tree == v
      case tree: Node => tree.search(v)
      case _          => false
    }
  }
  def insert(v: Int): Boolean = {
    if (root == None | root == v) {
      root = v
      true
    } else if (v < root.asInstanceOf[Int]) {
      insert(this.left, v)
      true
    } else if (v > root.asInstanceOf[Int]) {
      insert(this.right, v)
      true
    } else {
      false
    }
  }
  def insert(tree: Any, v: Int): Boolean = tree match {
    case tree: Int  => insertNewNode(this, tree, v)
    case tree: Node => tree.insert(v)
    case _          => false
  }

  def insertNewNode(tree: Node, a: Int, b: Int): Boolean = {
    val setSide = if (tree.left == a) { (x: Node) =>
      this.left = x
    } else { (x: Node) =>
      this.right = x
    }

    if (a > b) {
      setSide(new Node(a, b))
      true
    } else if (a < b) {
      setSide(new Node(b, a))
      true
    } else {
      false
    }
  }

}
