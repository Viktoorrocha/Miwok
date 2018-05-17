package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.provider.UserDictionary;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.LinearLayout;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("red","wetetti"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","takaakki"));
        words.add(new Word("gray","topoppi"));
        words.add(new Word("black","kululli"));
        words.add(new Word("white","kelelli"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow","chiwiiṭә"));


        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
