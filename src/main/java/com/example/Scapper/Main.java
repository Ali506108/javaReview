package com.example.Scapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://2gis.kz/almaty/search/%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0%20%D0%BF%D0%BE/rubricId/527";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements items = doc.select(".searchResults__item");

            for (Element item : items) {
                String name = item.select(".searchResults__name").text();
                String location = item.select(".searchResults__address").text();
                String phone = item.select(".contact__phones").text();

                System.out.println("Name: " + name);
                System.out.println("Location: " + location);
                System.out.println("Phone: " + phone);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
