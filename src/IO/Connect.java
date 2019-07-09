package IO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Connect {

    public static Document connection(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        }catch (IOException e){
            System.out.println("Fehler beim Zugriff auf die URL");
        }

        return doc;
    }

}
