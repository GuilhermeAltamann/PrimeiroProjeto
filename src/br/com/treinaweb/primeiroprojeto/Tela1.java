package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends Activity implements OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
		EditText txtNome = (EditText) findViewById(R.id.editTextNome);

		String msg = "Nome: " + txtNome.getText().toString();
		tvResultado.setText(msg);

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

		Button btn = (Button) findViewById(R.id.buttonProximo);
		btn.setOnClickListener(this);
	}

}
