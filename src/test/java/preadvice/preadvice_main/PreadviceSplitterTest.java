package preadvice.preadvice_main;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class PreadviceSplitterTest {

	@Test
	public void testSplit() {

		PreadviceSplitter paSplitter = new PreadviceSplitter();
		String payloadToSplitString = "a csv line\r\nsecond csv line";

		List<String> arrayOfLineStrings = paSplitter.split(payloadToSplitString);

		assertNotNull("Null returned from splitter", arrayOfLineStrings);
		assertTrue(arrayOfLineStrings.size() == 2);
		Iterator<String> itr = arrayOfLineStrings.iterator();
		String test = itr.next();
		assertTrue("Expected Testing1", test.equalsIgnoreCase("a csv line"));
		test = itr.next();
		assertTrue("Expected Testing2", test.equalsIgnoreCase("second csv line"));
	}

}
