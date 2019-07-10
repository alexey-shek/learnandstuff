package io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ContentRetriever {

    public static Document getDocument(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        }catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }

}
