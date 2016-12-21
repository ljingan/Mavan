package com.utils;

import java.beans.XMLDecoder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlUtil {
	@SuppressWarnings("unchecked")
	public static <T> List<T> readXml2List(InputStream in) throws Exception {
		List<Object> objList = new ArrayList<Object>();
		XMLDecoder decoder = new XMLDecoder(in);
		Object obj = decoder.readObject();
		while (obj != null) {
			try {
				objList.add(obj);
				obj = decoder.readObject();
			} catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		decoder.close();
		in.close();
		return (List<T>) objList;
	}
}
