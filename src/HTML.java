import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

public class HTML {


    public void scrape(Document doc){
        Elements element = doc.select("body");
        ArrayList<String> arrayList;
        arrayList = getDomain(element);
        //countDomain(getDomain(element));

        for (Object url: arrayList) {
            System.out.println("Die URL: "+url+" kommt "+countDomain(arrayList,url)+" mal vor.");
        }




        //countDomain2(getDomain(element));
    }



    private ArrayList getDomain(Elements element){
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
                Collections.sort(list);

                //System.out.println(list);
            }

        }
        System.out.println(list.size());


        return list;
    }


    private int countDomain(ArrayList list, Object obj){
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

    private void countDomain2(ArrayList list){
        Set<String> set = new HashSet<>();

        for (Object url : list) {
            if (set.add(url.toString())==false){
                System.out.println("duplikat gefunden");
            }
        }
    }

}
