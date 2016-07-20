package in.dineshsunny.model;

import java.util.ArrayList;

/**
 * Created by Macbook on 16/07/16.
 */

public class QuoteArray {

    public ArrayList<Quote> quotesList = new ArrayList();

    public QuoteArray(){
        quotesList.add(new
                Quote("Chapati", "Abhishek"));
        quotesList.add(new
                Quote("Tandoori Naan", "Parag"));
        quotesList.add(new
                Quote("Rumali Roti", "Harsha"));
        quotesList.add(new
                Quote("Butter Naan", "Shantanu"));
        quotesList.add(new
                Quote("Aaloo paratha", "Yash"));
    }


}
