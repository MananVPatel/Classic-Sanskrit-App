package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class phrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Welcome", "स्वागतम् (swāgatam)"));
        words.add(new Word("hello", "नमस्ते (namaste)"));
        words.add(new Word("How are you?", "कथमस्ति भवान् (kathamasti bhawān)"));
        words.add(new Word("What's your name?", "तव नाम किम् (tava nāma kim?)"));
        words.add(new Word("My name is ...", "अहम् ... (aham ...)"));
        words.add(new Word("Where are you from?", "भवान् कुत्रत्य: (bhawān kutratyah)"));
        words.add(new Word("Good Morning!", "सुप्रभातम् (suprabhātam)"));
        words.add(new Word("Good night", "शुभरात्री (shubharātrī)"));
        words.add(new Word("Goodbye ", "पुनर्मिलाम (punarmilāma) – lets meet again"));
        words.add(new Word("Good luck", "सौभाग्यम् (saubhāgyam)"));
        words.add(new Word("Have a nice day", "सुदिनमस्तु (sudinamastu)"));
        words.add(new Word("Bon appetit", "भोजनं स्वादिष्टमस्तु (bhojanam swādishtamastu)"));
        words.add(new Word("I don't understand", "नावगच्छामि (nāvagacchāmi)"));
        words.add(new Word("I don't know", "न जानामि (na jānāmi)"));
        words.add(new Word("How much is this?", "कियत्? (kiyat?)"));
        words.add(new Word("Please write it down", "कृपया पुनर्वदतु (kripayā punarwadatu)"));
        words.add(new Word("Excuse me", "कृपया क्षम्यताम् (kripayā kshamyatām)"));
        words.add(new Word("Thank you", "धन्यवादाः (dhanyawādāh)"));
        words.add(new Word("I love you ", "त्वामनुरजामि (twāmanurajāmi)"));
        words.add(new Word("Get well soon", "तूर्णमारोग्यमस्तु (tūrnamārogyamastu)"));

        WordAdapter wAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wAdapter);

    }
}
