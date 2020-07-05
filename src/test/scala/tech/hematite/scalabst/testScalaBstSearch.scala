package tech.hematite.scalabst

import org.scalatest.flatspec.AnyFlatSpec

class SearchBstTest extends AnyFlatSpec {
  val tree3 = new Node(1, 0, 2)
  "A Simple Tree" should "be able to search for a value" in {
    assert(tree3.search(0))
    assert(tree3.search(1))
    assert(tree3.search(2))
  }

  it should "return false if value not found" in {
    assert(!tree3.search(3))
  }

  "A multi-level Tree" should "be searchable for a value" in {
    val subtree = new Node(2, new Node(1, 0), 3)
    assert(subtree.search(0))
    assert(subtree.search(1))
    assert(subtree.search(3))
  }

  it should "return false if value not found" in {
    val subtree = new Node(2, new Node(1, 0), 3)
    assert(!subtree.search(4))
  }
}
