package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela1 extends Activity implements OnClickListener{

	@Override
	public void onClick(View v) {
	  // TODO Auto-generated method stub
	  Intent intencao = new Intent(Tela1.this, Tela2.class);
	  startActivity(intencao);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

		Button btn = (Button) findViewById(R.id.buttonProximo);
		btn.setOnClickListener(this);
	}

}
