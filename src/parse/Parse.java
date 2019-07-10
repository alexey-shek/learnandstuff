package parse;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parse {


    public static void parseHtml(Document doc){
        Elements element = doc.select("body");
        List<String> arrayList = beatifyUrl(element);

        Set<String> output = new HashSet<>();


        for (String url: arrayList) {
            output.add("Die URL: "+url+" kommt "+countDomain(arrayList,url)+" mal vor.");

        }

        for (Object obj : output
             ) {
            System.out.println(obj);
        }



    }



    private static List<String> beatifyUrl(Elements element){
        List<String> list = new ArrayList<>();

        for (Element el : element.select("a")){
            if (el.attr("href").equals("")){
                continue;
            }
            else {
                list.add(el.attr("href")
                        .replace("https://www.","")
                        .replace("http://www.","")
                        .replace("https://","")
                        .replace("http://", "")
                        .replaceAll("\\/.*",""));
            }

        }
        System.out.println(list.size());


        return list;
    }


    private static int countDomain(List<String> list, String obj){
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (obj.equals(list.get(i))){
                counter++;
            }
        }
        return counter;
    }

}
