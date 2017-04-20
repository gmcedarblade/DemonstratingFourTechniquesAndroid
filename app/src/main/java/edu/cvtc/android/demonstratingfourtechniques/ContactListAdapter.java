package edu.cvtc.android.demonstratingfourtechniques;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Greg on 4/20/2017.
 */

public class ContactListAdapter extends BaseAdapter{

    private Context context;
    private List<String> contactList;

    public ContactListAdapter(final Context context, List<String> contactList) {

        this.context = context;
        this.contactList = contactList;

    }

    @Override
    public int getCount() {
        return null != contactList ? contactList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return null != contactList ? contactList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (null == convertView) {

            convertView = new TextView(context);

        }

        final String contact = contactList.get(position);
        ((TextView) convertView).setText(contact);

        return convertView;

    }
}
