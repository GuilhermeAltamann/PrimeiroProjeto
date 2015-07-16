package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela5 extends Activity {

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    // TODO Auto-generated method stub
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_tela5);

	      Button btnOk = (Button) findViewById(R.id.buttonOk);
	      btnOk.setOnClickListener(clickListener);

	      RadioButton rbAndroid = (RadioButton) findViewById(R.id.radioButtonAndroidBasico);
	      RadioButton rbJava = (RadioButton) findViewById(R.id.radioButtonJavaBasico);
	      RadioButton rbCSharp = (RadioButton) findViewById(R.id.radioButtonCSharpBasico);

	      rbAndroid.setOnClickListener(clickListenerRadioButton);
	      rbJava.setOnClickListener(clickListenerRadioButton);
	      rbCSharp.setOnClickListener(clickListenerRadioButton);
	  }

	  private OnClickListener clickListener = new OnClickListener(){

	    @Override
	    public void onClick(View view) {
	      TextView resposta = (TextView) findViewById(R.id.textViewResposta);

	      RadioGroup grupo = (RadioGroup) findViewById(R.id.rdGroupCursos);

	      int radioId = grupo.getCheckedRadioButtonId();

	        String msg = "Curso selecionado: ";
	      if(radioId != -1){
	        RadioButton rb = (RadioButton) findViewById(radioId);
	        msg += rb.getText().toString() + " ";
	      }
	      else{
	        msg = "Nenhum RadioButtton selecionado!";
	      }

	      resposta.setText(msg);
	    }
	  };

	  private OnClickListener clickListenerRadioButton = new OnClickListener(){

	    @Override
	    public void onClick(View view) {
	      TextView resposta = (TextView) findViewById(R.id.textViewResposta);

	      if(((RadioButton) view).isChecked())
	            resposta.setText("Curso: " + ((RadioButton) view).getText() + " selecionado!");
	        else
	            resposta.setText("Curso: " + ((RadioButton) view).getText() + " não está selecionado!");
	    }
	  };

	}