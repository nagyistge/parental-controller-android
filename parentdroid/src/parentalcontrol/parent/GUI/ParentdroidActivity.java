package parentalcontrol.parent.GUI;

import parentalcontrol.parent.R;
import parentalcontrol.parent.Logic.ShowMSGService;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParentdroidActivity extends Activity {
	private Button btmain;
	private Button btmsg;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/*
		 * show the mail default botton
		 */
		btmain = (Button) findViewById(R.id.buttonMain);
		btmain.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(),
						"Show the List of Options to get Information",
						Toast.LENGTH_LONG).show();
				Intent l = new Intent(ParentdroidActivity.this,
						SMSSendActivity.class);
				startActivity(l);
				
			}
		});
		/*
		 * send the msg to parentdroid
		 */
		this.btmsg = (Button) findViewById(R.id.showmsgbutton1);
		this.btmsg.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(),
						"Show the messages received by Parent",
						Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(ParentdroidActivity.this, SMSReceiveActivity.class);
				startService(intent);
			}
		});
	}
}