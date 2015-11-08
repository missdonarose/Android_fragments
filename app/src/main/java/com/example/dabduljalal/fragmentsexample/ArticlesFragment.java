package com.example.dabduljalal.fragmentsexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArticlesFragment extends Fragment {

    public static final String HEADLINE_ARG = "HEADLINES";

    public ArticlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

        /**
         * The below code is used when the fragment is newly created and replaces
         * the headline fragment. For fragment to fragment communication for exsiting
         * fragments,  this code can be placed directly in the method call
         * setArticleForSelectedHeadline
         */
        TextView textView = (TextView)view.findViewById(R.id.article_text);
        Bundle bundle = this.getArguments();
        if(textView!=null)
        {
            String headline = bundle.getString(HEADLINE_ARG);
            textView.setText(headline+" "+headline+" "+headline);
        }

        return view;
    }


    /**
     * Set the text of article text according to the headline passed
     * @param headline
     */
    public void setArticleForSelectedHeadline(String headline)
    {
        Log.d(this.getClass().toString(), "Reached setArticleForSelectedHeadline.headline = " + headline);
        if(this.getActivity()!=null)
        {
            TextView textView = (TextView)this.getActivity().findViewById(R.id.article_text);
            textView.setText(getString(R.string.article_fragment_details)+ headline);
        }

    }
}
