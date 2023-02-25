/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.app;

import com.mycompany.app.Dictionary.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author JohnBaizanis
 */
public class App {

    public static void main(String[] args) { /*
        
        Dictionary<String, Integer> dict = new OpenAddressingHashTable<>();
		
		try (Scanner scanner = new Scanner(System.in)) { // file input stream
			while(scanner.hasNext()) { 
				String line = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()) { 
					String word  = st.nextToken();
					Integer curFreq = dict.get(word);
					if (curFreq == null) { 
						curFreq = 1;
					} else { 
						curFreq++;
					}
					dict.put(word, curFreq);
				}
			}
		}
		
		for(Entry<String, Integer> e: dict) { 
			System.out.println("Word " + e.getKey() + " appeared " + e.getValue() + " times");
		}
*/
      Dictionary<Integer, Integer> dict = new OpenAddressingHashTable<>(4,3);  
    }
}
