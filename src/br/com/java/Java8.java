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
		
		Comparator<String> comparato = new ComparatorStringPorTamanho();
		//Collections.sort(palavras, comparato);
		palavras.sort(comparato);
		
		Consumer<String> consume = new ConsumidorDeString();
		palavras.forEach(consume);
		
		System.out.println(palavras);
	}
}

class ConsumidorDeString implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);		
	}
}

class ComparatorStringPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) 
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
}
