package lt.PriceComparisonEngine.comparer.service;

import lt.PriceComparisonEngine.comparer.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ScraperServiceImpl implements ScraperService {
    @Value("${varle_url}")
    String varleUrl;

    public List<Product> scrapeProductsByName(String productName){

        List<Product> allRetrievedProducts = new ArrayList<>();
        allRetrievedProducts.addAll(scrapeDataFromVarle(varleUrl,productName));
        return allRetrievedProducts;
    }

    private List<Product> scrapeDataFromVarle(String url,String productName) {
        try {
            List<Product> retrievedProducts = new ArrayList<>();
            Document document = Jsoup.connect(url + productName).get();
            Elements elements = document.getElementsByClass("GRID_ITEM");

            for (Element element : elements) {
                String image = element.getElementsByClass("product-img").attr("src");
                String price = element.getElementsByClass("price-value").text();
                String name = element.getElementsByClass("product-title").text();

                retrievedProducts.add(new Product(name, price, image));
            }

            return retrievedProducts;

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}

