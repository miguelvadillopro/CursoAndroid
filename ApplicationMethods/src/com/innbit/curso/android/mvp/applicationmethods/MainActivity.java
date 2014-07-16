package com.innbit.curso.android.mvp.applicationmethods;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tToast("onCreate");
	}
	public void onStart() {
    	super.onStart();
    	tToast("onStart");
    }

    public void onRestart() {
    	super.onRestart();
    	tToast("onRestart");
    }

    public void onResume() {
    	super.onResume();
    	tToast("onResume");
    }

    public void onPause() {
    	super.onPause();
    	tToast("onPause");
    }

    public void onStop() {
    	super.onStop();
    	tToast("onStop");
    }

    public void onDestroy() {
    	super.onStop();
    	tToast("onDestroy");
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    }
}
