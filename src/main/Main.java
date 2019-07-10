package main;

import IO.retrieveContent;
import parse.Parse;

public class Main {

    public static void main(String[] args) {

        Parse.parseHtml(retrieveContent.getDocument("http://l3x4.de/test/test.html"));

    }
}
