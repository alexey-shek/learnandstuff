public class Main {

    public static void main(String[] args) {
        Connect cn = new Connect();
        HTML page = new HTML();

        page.getHtml(cn.connection("https://www.t-online.de/nachrichten/"));


        //StringBuilder sb = new StringBuilder();
        //sb.append(cn.connection("https://css-tricks.com/almanac/"));
        //System.out.println(sb);


    }
}
