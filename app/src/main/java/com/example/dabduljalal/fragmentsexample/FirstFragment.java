package com.example.dabduljalal.fragmentsexample;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);

        /*
        Add click listeer to show a toast
         */
        view.findViewById(R.id.first_fragment_button)
        .setOnClickListener(this);
        return view;
    }

    /**
     * On button click, replace this fragment with two new fragments.
     * @param view
     */
    public void onClick(View view)
    {
        Log.d(this.getClass().toString(),"Reached onClick event of First Fragment Button");
        //Toast.makeText(view.getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(view.getContext(),FragmentsActivity.class);
        startActivity(intent);
        
    }
}
