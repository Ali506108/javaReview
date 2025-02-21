package com.example.empire;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Scraper {
    public static void scrapeProductPage(
            List<TwoUrl> products,
            Set<String> pagesDiscovered,
            List<String> pagesToScrape
    ) {
        if (!pagesToScrape.isEmpty()) {
            // the current web page is about to be scraped and
            // should no longer be part of the scraping queue
            String url = pagesToScrape.remove(0);

            pagesDiscovered.add(url);

            // initializing the HTML Document page variable
            Document doc;

            try {
                // fetching the target website
                doc = Jsoup
                        .connect(url)
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36")
                        .get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // retrieving the list of product HTML elements
            // in the target page
            Elements productElements = doc.select("li.product");

            // iterating over the list of HTML products
            for (Element productElement : productElements) {
                TwoUrl Product = new TwoUrl();

                // extracting the data of interest from the product HTML element
                // and storing it in Product
                Product.setUrlTitle(productElement.selectFirst("span").attr("span"));
                Product.setPhoneNumber(productElement.selectFirst("bdo").attr("src"));
                Product.setAddress(productElement.selectFirst("span").text());

                // adding Product to the list of the scraped products
                products.add(Product);
            }

            // retrieving the list of pagination HTML element
            Elements paginationElements = doc.select("a.page-numbers");

            // iterating over the pagination HTML elements
            for (Element pageElement : paginationElements) {
                // the new link discovered
                String pageUrl = pageElement.attr("href");

                // if the web page discovered is new and should be scraped
                if (!pagesDiscovered.contains(pageUrl) && !pagesToScrape.contains(pageUrl)) {
                    pagesToScrape.add(pageUrl);
                }

                // adding the link just discovered
                // to the set of pages discovered so far
                pagesDiscovered.add(pageUrl);
            }

            // logging the end of the scraping operation
            System.out.println(url + " -> page scraped");
        }
    }

    public static void main(String[] args) {
        // initializing the list of Java object to store
        // the scraped data
        List<TwoUrl> products = new ArrayList<>();

        // initializing the set of web page urls
        // discovered while crawling the target website
        Set<String> pagesDiscovered = new HashSet<>();

        // initializing the queue of urls to scrape
        List<String> pagesToScrape = new ArrayList<>();
        // initializing the scraping queue with the
        // first pagination page
        pagesToScrape.add("https://2gis.kz/almaty/search/%D0%91%D0%B8%D0%B7%D0%BD%D0%B5%D1%81-%D1%86%D0%B5%D0%BD%D1%82%D1%80%D1%8B/rubricId/13796?m=76.909414%2C43.223084%2F15.82");

        // the number of iteration executed
        int i = 0;
        // to limit the number to scrape to 5
        int limit = 12;

        while (!pagesToScrape.isEmpty() && i < limit) {
            scrapeProductPage(products, pagesDiscovered, pagesToScrape);
            // incrementing the iteration number
            i++;
        }

        System.out.println(products.size());
        // writing the scraped data to a db or export it to a file...
    }
}
