package dev.lpa;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String sentence = "I like B.M.W. motorcycles.";

        // Starts with capital letter, then any characters, then period
        // Regex is compiled in to a Pattern by Java's regex processor
        boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
        System.out.println(matched + ": " + sentence);

        // Much more efficient for scaling
        Pattern firstPattern = Pattern.compile("[A-Z].*?[.]");
        var matcher = firstPattern.matcher(sentence);
        System.out.println(matcher.matches() + ": " + sentence);
        System.out.println("sentence.length: " + sentence.length());
        System.out.println("Matched Ending Index: " + matcher.end());

        System.out.println(matcher.lookingAt() + ": " + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(0, matcher.end()));


        System.out.println("-------------");

        System.out.println(matcher.lookingAt() + ": " + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(0, matcher.end()));




    }
}