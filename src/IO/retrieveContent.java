package IO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class retrieveContent {

    public static Document getDocument(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        }catch (IOException e){
            e.printStackTrace();
        }

        return doc;
    }

}
