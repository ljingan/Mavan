package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Entry {
	private static Logger log = LoggerFactory.getLogger(Entry.class);

	public static void main(String[] args) throws InterruptedException {
		Context context = new Context();
		// try {
		context.initialize();
		// Thread.sleep(3000);
		log.error("finish start server.....");
		// } catch (Exception e) {
		// log.error(e.toString());
		// } finally {
		// log.error("can not start server.....");
		// p = ctx.getBean("person",LoginBean.class);//创建bean的引用对象
		// p.info();
		// }
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sss");
		map.put(2, "ghhh");
		map.put(3, "ssbgbgbs");
		Set<Integer> set = map.keySet();
		Set<Map.Entry<Integer, String>> mt = map.entrySet();
		
		for(Map.Entry<Integer, String> it:mt)
		{
			System.out.print(it.getKey() + "  " + it.getValue() + "\n");
			//String str = map.get(it);
			//System.out.print(it +"  " + str);
		}
	}
}
