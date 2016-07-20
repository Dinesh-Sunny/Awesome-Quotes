package in.dineshsunny.awesomequotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import in.dineshsunny.adapters.CustomAdapter;
import in.dineshsunny.model.QuoteArray;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    RecyclerView rv = (RecyclerView)
            findViewById(R.id.recyclerView);

    rv.setLayoutManager(
            new LinearLayoutManager(this));

        rv.setAdapter(
                new CustomAdapter(
                        new QuoteArray().
                                quotesList));
    }

}
