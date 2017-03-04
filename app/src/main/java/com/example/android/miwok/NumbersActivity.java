package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "एकम् (ekam)"));
        words.add(new Word("two", "द्वे (dve)"));
        words.add(new Word("three", " त्रीणि (treeni)"));
        words.add(new Word("four", "चत्वारि (chatvaari)"));
        words.add(new Word("five", "पञ्च (pancha)"));
        words.add(new Word("six", "षट् (shat)"));
        words.add(new Word("seven", "सप्त (sapta)"));
        words.add(new Word("eight", "अष्ट (ashta)"));
        words.add(new Word("nine", "नव (nava)"));
        words.add(new Word("ten", "दश (dasha)"));
        words.add(new Word("eleven", "एकादश (ekaadasha)"));
        words.add(new Word("twelve", "द्वादश (dvaadasha)"));
        words.add(new Word("thirteen", "त्रयोदश (trayodasha)"));
        words.add(new Word("fourteen", "चतुर्दश (chaturdasha)"));
        words.add(new Word("fifteen", "पञ्चदश (panchadasha)"));
        words.add(new Word("sixteen", "षोडश (shodash)"));
        words.add(new Word("seventeen", "सप्तदश (saptadasha)"));
        words.add(new Word("eighteen", "अष्टादश (ashtaadasha)"));
        words.add(new Word("nineteen", "नवदश (navadasha)"));
        words.add(new Word("twenty", "विंशतिः (vimshatihi)"));

        WordAdapter wAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wAdapter);

    }
}
