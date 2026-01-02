package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
	private List<Tree> trees;

    public Ecosystem() {
        // your code goes here
        this.trees = new ArrayList<>();
    }

    public void addTree(Tree tree) {
        // your code goes here
        trees.add(tree);
    }

    public List<Tree> getTrees() {
        return trees;
    }
    
    public String displayEcosystem() {
        StringBuilder result = new StringBuilder();
        //your code goes here
        return result.toString();
    }
}
