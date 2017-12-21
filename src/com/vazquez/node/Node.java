package com.vazquez.node;

public class Node {
	String identifier;
	int value;
	private Node right, left;
	
	public Node(int value) {
		this.value = value;
	}

	public int get_value() {
		return this.value;
	}

	/**
	 * @return the right
	 */
	public Node get_right() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void set_right(Node right) {
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public Node get_left() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void set_left(Node left) {
		this.left = left;
	}

	/**
	 * Inserts numbers in the node tree.
	 * @param data
	 */
	public void insert(int data) {
		int node_data = this.get_value();

		if(data < node_data) {
			Node left = this.get_left();
			if(left != null) {
				left.insert(data);
			}else {
				this.set_left(new Node(data));
			}
		} else {
			Node right = this.get_right();
			if(right != null) {
				right.insert(data);
			} else {
				this.set_right(new Node(data));
			}
		}
	}
}
