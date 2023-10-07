/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04022_Wordset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class WordSet {
    private TreeSet<String> words;

    public WordSet() {
        words=new TreeSet<>();
    }
    
    public WordSet(String s){
        words=new TreeSet<>();
        String [] wordArray =s.toLowerCase().split("\\s+");
        for(String word : wordArray){
            words.add(word);
        }
    }
    public WordSet union(WordSet o){
        WordSet unionSet=new WordSet();
        unionSet.words.addAll(words);
        unionSet.words.addAll(o.words);
        return unionSet;
    }
    public WordSet intersection(WordSet o){
        WordSet intersectionSet=new WordSet();
        intersectionSet.words.addAll(words);
        intersectionSet.words.retainAll(o.words);
        return intersectionSet;
    }
    public String toString(){
        String s="";
        for(String i :words){
            s+=i+" ";
        }
        return s;
    }
}
