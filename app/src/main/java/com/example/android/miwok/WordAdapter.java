package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by namlu on 03-Aug-16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words  A List of word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words){
        // We initialize the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        // listItemView == null means that there a no views to reuse, so a new view will need to
        // be manually inflated from list_item.xml
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the Miwok translation
        // Then get the Miwok word from the current Word object and
        // set this text on the name TextView
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.tv_miwok);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the default translation
        // Then get the default word from the current Word object and
        // set this text on the name TextView
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.tv_default);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the imageView in the list_item.xml layout with the image
        // Then get the image from the current Word object and
        // set this image on the name ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.iv_image);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResId());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
