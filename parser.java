import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.net.URL;

public class parser {

    public static Document getPage() throws IOException {
        String url = "https://www.gismeteo.ru/weather-krasnodar-5136/month/";
        Document page = Jsoup.parse(new URL(url),10000);
        return page;
        System.out.println("0-");




    }
    public static void main(String[] args) throws IOException {
        Document page = getPage();


        Elements tableWth = page.select("div[class = tooltip cell _hover]");
        Elements date = tableWth.select("div [class = date]");
        Elements temp_day =  tableWth.select("div[class = temp_max js_meas_container]");
        Elements temp_night = tableWth.select("div[class =js_value val_to_convert]");

        for(Element day : date){
            String date_rez = date.select("span").text();
            System.out.println(date_rez);
        }
//        System.out.println(tableWth);
//        System.out.println(date);

    }
}
