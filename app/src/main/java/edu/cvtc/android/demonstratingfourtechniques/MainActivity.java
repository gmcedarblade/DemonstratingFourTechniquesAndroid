package edu.cvtc.android.demonstratingfourtechniques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ContactListAdapter contactListAdapter;

    private List<String> contactList = new ArrayList<>();

    private View.OnClickListener addContactListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            addContactFromEditText();
        }
    };

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

        final Button addContactButton = (Button) findViewById(R.id.addContactButton);
        /**
         * Anonymous Inner Type
         */
        addContactButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view) {
               addContactFromEditText();
           }
        });


        /**
         * Add a listener to our button
         */
//        final Button addContactButton = (Button) findViewById(R.id.addContactButton);
//        addContactButton.setOnClickListener(this);

        /**
         * Using the ButtonListener named class..
//         */
//        final ButtonListener buttonListener = new BUttonListener();
//        addContactButton.setOnClickListener(buttonListener);




    }

    @Override
    public void onClick(View view) {

        addContactFromEditText();

    }

    private void addContactFromEditText() {

        final EditText addContactEditText = (EditText) findViewById(R.id.addContactEditText);

        final String contact = addContactEditText.getText().toString();

        if (null != contact && !contact.isEmpty()) {

            contactList.add(contact);
            contactListAdapter.notifyDataSetChanged();

            addContactEditText.setText(""); // clear out the text field

        }

    }


    /**
     * Using a named class for OnClickListener Interface
     */
    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            addContactFromEditText();
        }
    }
}
