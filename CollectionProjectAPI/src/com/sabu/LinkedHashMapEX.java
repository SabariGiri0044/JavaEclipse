package com.sabu;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<int, String > ol=new LinkedHashMap<Int, String>(){
	ol.put( 787648256L, "Sabari");
	ol.put( 787698256L, "Sabu");
	ol.put( 787640256L, "SabariGiri");
	ol.put( 787648256L, "Mrsabu")
		}
	for(Map.Entry<int,String> m:ol.entrySet()) {
	System.out.println(m.getKey()+" : " + m.getValue());
	
}
}