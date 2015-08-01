/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * 
 * JDK 8 MOOC Lesson 3 homework
 */
package com.satish.oraclecourse.Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class to generate a list of random words
 *
 * @author Simon Ritter (@speakjava)
 */
public class RandomWords {
  private final List<String> sourceWords;

  /**
   * Constructor
   * 
   * @throws IOException If the source words file cannot be read
   */
  public RandomWords() throws IOException {   
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/satishkamavaram/git/Java7_8_features/src/com/satish/oraclecourse/Streams/words.txt"))) {
      sourceWords = reader.lines().collect(Collectors.toList());;    // YOUR CODE HERE
      
      System.out.println("Loaded " + sourceWords.size() + " words");
    }
  }

  /**
   * Create a list of a given size containing random words
   *
   * @param listSize The size of the list to create
   * @return The created list
   */
  public List<String> createList(int listSize) {
    Random rand = new Random();
    //wrong approach
    List<String> wordList = new ArrayList<>();// YOUR CODE HERE
    rand.ints(0,sourceWords.size()).limit(listSize).forEach(i -> wordList.add(sourceWords.get(i)));
    //Correct approach
    	List<String> wordList1 = rand.ints(0,sourceWords.size()).limit(listSize).mapToObj(i ->sourceWords.get(i) ).collect(Collectors.toList());
    	
    	List<String> wordList2 = rand.ints(0,sourceWords.size()).limit(listSize).mapToObj(sourceWords::get ).collect(Collectors.toList());
    
    	System.out.println(wordList2);
    return wordList2;
  }

  /**
   * Return the list of all source words, which cannot be modified
   *
   * @return The unmodifiable list of all source words
   */
  public List<String> allWords() {
    return Collections.unmodifiableList(sourceWords);
  }
}