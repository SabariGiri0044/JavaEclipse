package com.sabu;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, String > ol=new HashMap<Long,String>();
//		ol.put("Sabu       ", 787648256);
//		ol.put("Sabari     ", 787698256);
//		ol.put("MrSabu     ", 787640256);
//		ol.put("SabariGiri ", 787648256);
		
		ol.put( 787648256L, "Sabari");
		ol.put( 787698256L, "Sabu");
		ol.put( 787640256L, "SabariGiri");
		ol.put( 787648256L, "Mrsabu");
		for(Map.Entry<Long,String> m:ol.entrySet()) {
		System.out.println(m.getKey()+" : " + m.getValue());

	}
}        
}
