package br.com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8 {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("React Native");
		palavras.add("Java");
		palavras.add("Python");
		palavras.add("Spring Boot");
		
		//Comparator<String> comparato = new ComparatorStringPorTamanho();
		//Collections.sort(palavras, comparato);
		//palavras.sort(comparato);
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.forEach(System.out::println);
		
		//palavras.forEach(s -> System.out.println(s));
		
		System.out.println(palavras);
	}
}

//class ComparatorStringPorTamanho implements Comparator<String> {
//	public int compare(String s1, String s2) {
//		if(s1.length() < s2.length()) 
//			return -1;
//		if(s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//}
