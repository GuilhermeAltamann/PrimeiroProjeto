package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
	}
	
	public void cliqueBotaoOK(View v){
		TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
		EditText txtNome = (EditText) findViewById(R.id.editTextNome);
		
		String msg = "Nome: " + txtNome.getText().toString();
		tvResultado.setText(msg);
		
	}

}
