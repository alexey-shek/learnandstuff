import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

public class HTML {


    public void scrape(Document doc){
        Elements element = doc.select("body");
        ArrayList<String> arrayList;
        arrayList = getDomain(element);

        Set<String> output = new HashSet<>();
        //countDomain(getDomain(element));


        for (Object url: arrayList) {
            //System.out.println("Die URL: "+url+" kommt "+countDomain(arrayList,url)+" mal vor.");
            output.add("Die URL: "+url+" kommt "+countDomain(arrayList,url)+" mal vor.");

        }

        for (Object obj : output
             ) {
            System.out.println(obj.toString());
        }

        //countDomain2(getDomain(element));

        for (int i = 0; i < arrayList.size(); i++) {
            countDomain2(arrayList.get(i));
        }


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
                        //.replaceAll(".*?\\.(.*?\\.[a-zA-Z]+)",""));
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

    private void countDomain2(String list){
        Set<String> set = new HashSet<>();
        int counter = 0;

            if (set.add(list) == false){
                counter++;
                System.out.println("duplikat");
            }

    }

}
