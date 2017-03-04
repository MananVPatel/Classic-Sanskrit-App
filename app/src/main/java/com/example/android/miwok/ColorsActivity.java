package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "रक्तः (raktaḥ)"));
        words.add(new Word("blue", "नीलः (nīlaḥ)"));
        words.add(new Word("yellow", "पीतः (pītaḥ)"));
        words.add(new Word("green", "हरितः (haritaḥ)"));
        words.add(new Word("pink", "पाटलः (pāṭalaḥ)"));
        words.add(new Word("purple", "धूमलः (dhūmalaḥ)"));
        words.add(new Word("white", "श्वेतः (shvetaḥ)"));
        words.add(new Word("black", "कृष्णः (kṛṣṇaḥ)"));
        words.add(new Word("orange", "नारन्गः (nārangaḥ)"));
        words.add(new Word("brown", "न्यवरक्तपीत (nyavaraktapIta)"));

        WordAdapter wAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wAdapter);
    }
}
