package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "पितुः (pituh)"));
        words.add(new Word("mother", "मातृ (matr)"));
        words.add(new Word("son", "पुत्र  (putra)"));
        words.add(new Word("daughter", "पुत्री (putri)"));
        words.add(new Word("older brother", "ज्येष्ठ (jyestha)"));
        words.add(new Word("younger brother", "कनिष्ठ (kaniSTha)"));
        words.add(new Word("older sister", "अग्रजा (agraja)"));
        words.add(new Word("younger sister", "अनुजा (anujA)"));
        words.add(new Word("grandmother", "मातृका (matrka)"));
        words.add(new Word("grandfather", "आर्यक (Aryaka)"));

        WordAdapter wAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wAdapter);

    }
}
