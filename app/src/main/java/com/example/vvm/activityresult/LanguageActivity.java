package com.example.vvm.activityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import util.Language;

public class LanguageActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onSelectedLanguage (View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_eng:
                intent = new Intent();
                intent.putExtra("language", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btn_ukr:
                intent = new Intent();
                intent.putExtra("language", Language.UKRAINE.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btn_rus:
                intent = new Intent();
                intent.putExtra("language", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }
}
