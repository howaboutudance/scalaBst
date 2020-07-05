package tech.hematite.scalabst

import org.scalatest.flatspec.AnyFlatSpec

class InsertScalaBst extends AnyFlatSpec {
  val simpleTree = new Node(1, 0, 2)
  "Insert into tree" should "return true if insert success" in {
    assert(simpleTree.insert(3))
    assert(simpleTree.search(3))
  }

  it should "be able to find the insert on the expect branch" in {
    simpleTree.insert(-1)
    assert(simpleTree.getLeft().asInstanceOf[Node].getLeft() == -1)
  }
}
