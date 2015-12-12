package com.zazu.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class PropertyRetrieverTest {
	
	private PropertyRetriever retriever;

	@Test
	public void testPropertyRetriever() throws IOException {
		retriever = new PropertyRetriever();
		assertEquals("kickoff", retriever.getSubtasks("subtasks"));
	}

}
