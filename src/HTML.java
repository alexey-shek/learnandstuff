import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class HTML {

    public void getHtml(Document doc){
        Elements element = doc.select("div#Tmainbox");
        List<String> list = new ArrayList<>();

        for (Element el : element.select("a")){
            if (el.attr("href").equals("")){
                continue;
            }else {
                list.add(el.attr("href")
                        .replace("https://www.","")
                        .replace("https://","")
                        .replace("http://", "")
                        .replaceAll("\\/.*",""));
                Collections.sort(list);
                System.out.println(list);
            }

        }
        System.out.println(list.size());
    }

    public void getUniqueDomain(){

    }
}
