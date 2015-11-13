package com.example.intentsample3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityB extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityb);

		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setMessage("share the text");
		dialog.setIcon(R.drawable.share);
		dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {

				Intent returnIntent = new Intent();
				Bundle resultBundle = new Bundle();
				resultBundle.putString("message", "You pressed yes button");
				returnIntent.putExtras(resultBundle);
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});

		// Setting Negative "NO" Button
		dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {

				dialog.cancel();
			}
		});

		dialog.show();
	}
}
