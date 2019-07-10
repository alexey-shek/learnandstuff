package main;

import io.ContentRetriever;
import parse.Parse;

public class Main {

    public static void main(String[] args) {

        Parse.parseHtml(ContentRetriever.getDocument("http://l3x4.de/test/test.html"));

    }
}
