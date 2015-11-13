package com.example.intentsample3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.b1);
		b1.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Intent intent = new Intent(this, ActivityB.class);
		startActivityForResult(intent, 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent sendData) {

		super.onActivityResult(requestCode, resultCode, sendData);
		if (resultCode == RESULT_OK) {
			Bundle bundle = sendData.getExtras();
			String name = bundle.getString("message");
			Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
		}

	}
}
