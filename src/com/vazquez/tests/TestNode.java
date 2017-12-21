package com.vazquez.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.vazquez.node.Node;

class TestNode {

	public List<Integer> get_ordered_set() {
		List<Integer> data_set = Collections.synchronizedList(new ArrayList<Integer>(7));
		data_set.add(22);
		data_set.add(21);
		data_set.add(25);
		data_set.add(8);
		data_set.add(3);
		data_set.add(9);
		return data_set;
	}

	@Test
	void test_bst_insert() {
		int i = 0;
		Node bst = new Node(20);
		List<Integer>data_set = this.get_ordered_set();
		int set_size = data_set.size();

		while(i < set_size) {
			bst.insert(data_set.get(i));
			i++;
		}
	}

}
