/**
 * 
 */
package com.vazquez.bst;

import com.vazquez.node.Node;

/**
 * @author jvazquez
 *
 */
public class Bst {
	Node root;

	public Bst(Node seed) {
		this.root = seed;
	}

	/**
	 * Generate a tree structure
	 * @param node
	 */
	public void insert(int data) {
		this.root.insert(data);
	}
}
