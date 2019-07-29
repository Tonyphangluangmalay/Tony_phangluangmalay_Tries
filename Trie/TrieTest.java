import java.util.*;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
         
        // Set<Character> keys = trie.root.children.get('c').children.keySet();
        // for(Character key : keys){
        //    System.out.println(key);
        //  }
       
       
        trie.isPrefixValid("tri");
        trie.isWordValid("chip");
        trie.printAllKeys();

        
    }
}