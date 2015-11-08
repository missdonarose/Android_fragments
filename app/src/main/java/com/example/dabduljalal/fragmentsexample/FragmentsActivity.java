package com.example.dabduljalal.fragmentsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FragmentsActivity extends AppCompatActivity implements HeadLinesFragment.MyHeadlineListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        if(findViewById(R.id.headlines_frame)!=null)
        {
            //Add headlines and articles fragment
            HeadLinesFragment headlinesFragment = new HeadLinesFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.headlines_frame,headlinesFragment)
                    .commit();

            /*//Code for Activity to exiting fragment communication
            *HeadLinesFragment headlinesFragment = new HeadLinesFragment();
            mArticlesFragment = new ArticlesFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.headlines_frame,headlinesFragment)
                   .add(R.id.articles_frame,mArticlesFragment)
                    .commit();
            * */



        }else
            Log.d(this.getLocalClassName(),"Could not find headline or article frame container");


    }

    /**
     * Method which receives message from
     * Headline fragment. Pass the headline to article fragment.
     * @param headline
     */
    public void headlineClicked(String headline)
    {
        Log.d(this.getClass().toString(), "Reached headlineClicked. Headline = " + headline);

        ArticlesFragment articleFragment = new ArticlesFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ArticlesFragment.HEADLINE_ARG, headline);
        articleFragment.setArguments(bundle);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.headlines_frame, articleFragment, null).addToBackStack(null).commit();
            /*
            Code for Activity to exiting fragment communication
        mArticlesFragment.setArticleForSelectedHeadline(headline);
        */
       }
}
