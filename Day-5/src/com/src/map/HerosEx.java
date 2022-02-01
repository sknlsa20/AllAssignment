package com.src.map;
import java.util.TreeMap;
public class HerosEx {
    
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>((o1,o2)->((String)o1).compareTo((String)o2) > 0? -1:1);
        tm.put("Namrata Shirodkar", "Mahesh Babu");
        tm.put("Sneha Reddy", "Allu Arjun");
        tm.put("Lakshmi Pranathi", "jn NTR");
        tm.put("Radhika Pandit", "Yash");
        System.out.println(tm);
    }
}
