package main;

import io.ContentRetriever;
import parser.Parser;

public class Main {

    public static void main(String[] args) {

        Parser.parseHtml(ContentRetriever.getDocument("http://l3x4.de/test/test.html"));

    }
}
