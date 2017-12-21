package com.vazquez.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vazquez.bst.Bst;
import com.vazquez.node.Node;

class TestBst {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInsert() {
		int value = 20;
		Bst bst = new Bst(new Node(value));
		bst.insert(node);
	}

}
