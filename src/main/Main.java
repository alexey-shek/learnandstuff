package main;

import IO.Connect;
import parse.Parse;

public class Main {

    public static void main(String[] args) {

        Parse.scrape(Connect.connection("http://l3x4.de/test/test.html"));

    }
}
