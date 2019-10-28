package com.example.csbook.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.csbook.HomeActivity;
import com.example.csbook.Main2Activity;
import com.example.csbook.R;
import com.github.barteksc.pdfviewer.PDFView;

public class HomeFragment extends Fragment {
PDFView book1;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // homeViewModel =
         //       ViewModelProviders.of(this).get(HomeViewModel.class);
        //View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
        //homeViewModel.getText().observe(this, new Observer<String>() {
          //  @Override
            //public void onChanged(@Nullable String s) {
              //  textView.setText(s);
            //}
        //});
        //return root;

        View v = inflater.inflate(R.layout.fragment_home , container , false);
        Button btnOpen =(Button ) v.findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), HomeActivity.class);
                startActivity(in);
            }
        });



        Button btnOpen1 =(Button ) v.findViewById(R.id.btnOpen3);
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(getActivity(), Main2Activity.class);
                startActivity(in2);
            }
        });
        return v;


    }
}