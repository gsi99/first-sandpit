package preadvice.preadvice_main;

import java.util.Arrays;
import java.util.List;

public class PreadviceSplitter {

	public List<String> split(String payload) {

		return splitLines(payload);
	}

	private List<String> splitLines(String payload) {

		List<String> collection = Arrays.asList(payload.split("\\r?\\n"));

		return collection;
	}
}
