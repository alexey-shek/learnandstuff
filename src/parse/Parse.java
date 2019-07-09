package parse;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parse {


    public static void scrape(Document doc){
        Elements element = doc.select("body");
        List<String> arrayList = getDomain(element);

        Set<String> output = new HashSet<>();


        for (Object url: arrayList) {
            output.add("Die URL: "+url+" kommt "+countDomain(arrayList,url)+" mal vor.");

        }

        for (Object obj : output
             ) {
            System.out.println(obj);
        }



    }



    private static ArrayList getDomain(Elements element){
        ArrayList<String> list = new ArrayList<>();

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
                        //.replaceAll(".*?\\.(.*?\\.[a-zA-Z]+)",""));
            }

        }
        System.out.println(list.size());


        return list;
    }


    private static int countDomain(List<String> list, Object obj){
        int counter = 0;

        //list.get(i) mit der for schleife vergleichen mit obj

        for (int i = 0; i < list.size(); i++) {
            if (obj.equals(list.get(i))){
                counter++;
                //System.out.println("duplikat");
            }
        }
        return counter;
    }

}
