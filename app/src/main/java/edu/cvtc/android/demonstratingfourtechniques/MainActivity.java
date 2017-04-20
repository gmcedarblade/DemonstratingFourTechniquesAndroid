package edu.cvtc.android.demonstratingfourtechniques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ContactListAdapter contactListAdapter;

    private List<String> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main);

        /**
         * Binds our model to our view
         */
        final ListView contactListView = (ListView) findViewById(R.id.contactListViewGroup);
        contactListAdapter = new ContactListAdapter(this, contactList);
        contactListView.setAdapter(contactListAdapter);



    }

    @Override
    public void onClick(View view) {

        //TODO: Add a new Contact from the text in EditText

    }
}
