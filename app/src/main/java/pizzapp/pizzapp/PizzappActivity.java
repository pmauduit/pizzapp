package pizzapp.pizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

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
        final Spinner pizzaSpinner = findViewById(R.id.pizzaChoiceSpinner);
        pizzaSpinner.setAdapter(adapter);

        final TextView odooUserName = findViewById(R.id.odooUserName);

        Button orderButton = findViewById(R.id.orderButton);

        final ImageView illustrationNiaise = findViewById(R.id.illustrationNiaise);

        // Hide the image when the user is entering its odoo username
        odooUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustrationNiaise.setVisibility(View.GONE);
                TextView tv = (TextView) v;
                if (tv.getText().toString().equals("Odoo user")) {
                    tv.setText("");
                }
            }
        });

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustrationNiaise.setVisibility(View.VISIBLE);
                odooUserName.setEnabled(false);
                pizzaSpinner.setEnabled(false);
            }
        });
    }

}
