package in.dineshsunny.model;

/**
 * Created by Macbook on 15/07/16.
 */

public class Quote {

    String titleText;
    String authorName;

    Quote(String titleText, String s2){
        this.titleText = titleText;
        authorName = s2;
    }

    public void setTitleText(String titleText){
        this.titleText = titleText;
    }

    public String getTitleText(){
        return titleText;
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

