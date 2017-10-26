package com.hash;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map map = Collections.synchronizedMap(new HashMap<>());
	}

}
