package tw.edu.hk.buyticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner theater;
    Spinner movies;
    Spinner tickets;
    TextView result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theater = (Spinner)findViewById(R.id.spinner1);
        movies = (Spinner)findViewById(R.id.spinner2);
        tickets = (Spinner)findViewById(R.id.spinner3);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] str1 = getResources().getStringArray(R.array.theater);
                String[] str2 = getResources().getStringArray(R.array.movies);
                String[] str3 = getResources().getStringArray(R.array.people);

                int indexOfTheater = theater.getSelectedItemPosition();
                int indexOfMovies = movies.getSelectedItemPosition();
                int numOfTicket = tickets.getSelectedItemPosition();
                result.setText("訂"+ str1[indexOfTheater] + str2[indexOfMovies] + str3[numOfTicket] +"張");
            }
        });
        result = (TextView)findViewById(R.id.textView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
