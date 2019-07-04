public class Main {

    public static void main(String[] args) {
        Connect cn = new Connect();
        HTML page = new HTML();

        page.scrape(cn.connection("http://l3x4.de/test/test.html"));



        //StringBuilder sb = new StringBuilder();
        //sb.append(cn.connection("https://css-tricks.com/almanac/"));
        //System.out.println(sb);


    }
}
