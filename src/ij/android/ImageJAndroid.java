package ij.android;

import com.example.imagejandroid.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ImageJAndroid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_jandroid);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image_jandroid, menu);
		return true;
	}

}
