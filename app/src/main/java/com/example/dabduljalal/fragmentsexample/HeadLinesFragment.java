package com.example.dabduljalal.fragmentsexample;


import android.app.Activity;
import android.content.Context;
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
public class HeadLinesFragment extends Fragment implements View.OnClickListener{

    FragmentsActivity mCallBack;

    public HeadLinesFragment() {
        // Required empty public constructor
    }


    /**
     * Interface to communicate with the parent activity.
     */
    public interface MyHeadlineListener
    {
        public void headlineClicked(String headline);
    }



    @Override
    public void onAttach(Context context)
    {
        Log.d(this.getClass().toString(),"Reached onAttach");
        super.onAttach(context);



        try {
            mCallBack = (FragmentsActivity) context;
        }catch(ClassCastException e)
        {
            Log.e(this.getClass().toString(),e.getMessage());
        }
    }

    @Override
    /**
     * Register click listeners for Headlines textViews
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_head_lines, container, false);

        //Register listeners
        view.findViewById(R.id.text_headline1).setOnClickListener(this);
        view.findViewById(R.id.text_headline2).setOnClickListener(this);

        return view;
    }

    /*
    Handle clicks on headlines
    Pass the text of Headline clicked to the activity
     */
    public void onClick(View view)
    {
        Log.d(this.getClass().toString(),"Reached onClick");
        //call activity.headlineClicked()
        //Pass view.getText() as parameter.
        String headlineString = ((TextView) view).getText().toString();
        Log.d(this.getClass().toString(),"Reached onClick Headline="+headlineString);
        if(mCallBack!=null)
        {
            Log.d("Inside onClick headline",headlineString);
            mCallBack.headlineClicked(headlineString);
        }

    }

}
