package tech.hematite.scalabst

import org.scalatest.flatspec.AnyFlatSpec

class ConstructEmptyTree extends AnyFlatSpec {
  val emptyNode = new Node()
  "A Empty Node" should "have empty root" in {
    assert(emptyNode.getRoot() == None)
  }

  it should "have empty left" in {
    assert(emptyNode.getLeft() == None)
  }

  it should "have empty right" in {
    assert(emptyNode.getRight() == None)
  }

  it should "not find a valid value from an arbitary integer" in {
    assert(!emptyNode.search(0))
  }
}

class ConstructTerminalNode extends AnyFlatSpec {
  val base1 = new Node(1)

  "A Terminal Node" should "be created with root value" in {
    assert(base1.getRoot() == 1)
  }

  it should "have empty left" in {
    assert(base1.getLeft() == None)
  }

  it should "have empty right" in {
    assert(base1.getRight() == None)
  }
}

class ConstructSimpleTree extends AnyFlatSpec {
  val base3 = new Node(1, 0, 2)
  val basem = new Node("A", -1, new Node(2.3, 2.1))
  "A Simple Tree Node" should "be created with left and right values" in {
    val base3 = new Node(1, 0, 2)
    assert(base3.getLeft() == 0)
    assert(base3.getRight() == 2)
  }

  it should "be able to assign left, right and root after construct" in {
    base3.setLeft(1)
    base3.setRoot(2)
    base3.setRight(3)

    assert(base3.getLeft() == 1)
    assert(base3.getRoot() == 2)
    assert(base3.getRight() == 3)
  }

  it should "be able to set a leaf to a negative" in {
    base3.setLeft(-1)
    assert(base3.getLeft() == -1)
  }

  "A Node" should "not contain a non-numeric value" in {
    assert(basem.getRight() == None)
  }
}
