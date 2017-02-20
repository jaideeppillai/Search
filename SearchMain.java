/**
 * 
 */
package com.jaideep.search.main;

import com.jaideep.search.parse;
import com.jaideep.search.parse.Parser;

import java.io.*;
import java.util.*;

/**
 * @author Jaideep
 *
 */
public class SearchMain extends AbstractSearch {

	/**
	 * 
	 */
	public SearchMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter an Englosh text: ");
		InputStream ios = System.in;
		int avail = ios.available();
		byte[] b = new byte[avail];
		ios.read(b, 0, b.length);
		
		String entrText  = new String(b);
		StringTokenizer tokenizer = new StringTokenizer(entrText);
		System .out.println("You have entered text: " + entrText);
		
		Parser parser = new EnglishParser();
		String tokens[] = parser.parse(entrText);
	}

}
