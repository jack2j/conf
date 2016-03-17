package com.importsource.conf;

import java.io.File;

/**
 * 数据源
 * 
 * @author Hezf
 * @version 1.0.0
 */
public abstract  class Source {
	private static File file;

	private Source() {
	}

	public static File getFile() {
		if (file == null) {
			file = new File("wc.xml");
		}
		return file;
	}
}