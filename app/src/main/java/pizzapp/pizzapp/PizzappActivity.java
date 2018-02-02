package pizzapp.pizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PizzappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzapp);
        List<String> pizzaList = new ArrayList<String>();
        pizzaList.add("Margherita");
        pizzaList.add("Calzone");
        pizzaList.add("Calzone gorgonzola");
        pizzaList.add("Calzone chevre");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, pizzaList);
        Spinner pizzaSpinner = (Spinner) findViewById(R.id.pizzaChoiceSpinner);
        pizzaSpinner.setAdapter(adapter);

    }
}
