import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Parser {
    static List<Country> countries = new ArrayList<>();

    public List<Country> sortByName(){
        List<Country> sortedByName = new ArrayList<>(countries);
        Collections.sort(sortedByName, Comparator.comparing(Country::getName));
        return sortedByName;
    }

    public List<Country> sortByPopulation(){
        List<Country> sortedByPopulation = new ArrayList<>(countries);
        Collections.sort(sortedByPopulation, Comparator.comparingInt(Country::getPopulation).reversed());
        return sortedByPopulation;
    }

    public List<Country> sortByArea(){
        List<Country> sortedByArea = new ArrayList<>(countries);
        Collections.sort(sortedByArea, Comparator.comparingDouble(Country::getArea).reversed());
        return sortedByArea;
    }

    public void setUp() throws IOException {
        File countryfile = new File("C:\\Users\\Click\\Desktop\\fourth\\Fourth-Assignment-HTML-Parser\\src\\Resources\\country-list.html");
        Document document = Jsoup.parse(countryfile, "UTF-8");
        Elements extractcountries = document.select(".country");

        for (Element extractcountry : extractcountries){
            String nameOfcountry = extractcountry.select(".country-name").text();
            String capitalOfcountre = extractcountry.select(".country-capital").text();
            int populationOfcountre = Integer.parseInt(extractcountry.select(".country-population").text());
            double areaOfcountry = Double.parseDouble(extractcountry.select(".country-area").text());
            Country country = new Country(nameOfcountry, capitalOfcountre, populationOfcountre, areaOfcountry);
            countries.add(country);
        }
    }


    public static void main(String[] args) {
        Parser parser = new Parser();
        try {
            parser.setUp(); // Parse the countries from the HTML file
            List<Country> sortedByPopulation = parser.sortByPopulation(); // Sort countries by population
            System.out.println("Countries sorted by population:");
            for (Country country : sortedByPopulation) {
                System.out.println(country);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while setting up the parser: " + e.getMessage());
        }
    }
}
