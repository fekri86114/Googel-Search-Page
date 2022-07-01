package com.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

	AppCompatEditText editText;
	AppCompatButton btnSearch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//define EditText and SearchButton
		editText = findViewById(R.id.editText);
		btnSearch = findViewById(R.id.btnSearch);

		// set setOnClickListener to the Button
		btnSearch.setOnClickListener(view -> {
			Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
			String term = editText.getText().toString();
			intent.putExtra(SearchManager.QUERY, term);
			startActivity(intent);
		});
	}
}