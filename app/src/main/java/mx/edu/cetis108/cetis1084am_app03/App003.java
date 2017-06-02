package mx.edu.cetis108.cetis1084am_app03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class App003 extends AppCompatActivity {

    EditText a,b;
    TextView lblNumeroMM,lblOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app003);
        a=(EditText)findViewById(R.id.txta);
        b=(EditText)findViewById(R.id.txtb);
        lblNumeroMM=(TextView)findViewById(R.id.lblNumeroMM);
        lblOp=(TextView)findViewById(R.id.lblOp);

    }
    public void botonaccion(View view)
    {
        int var1,var2, resultado;
        var1=Integer.parseInt(a.getText().toString());
        var2=Integer.parseInt(b.getText().toString());

        if(var1>var2)
        {
            lblNumeroMM.setText("Variable 1 es mayor que variable 2: "+var1);
            resultado=var1-var2;
            lblOp.setText(var1+"-"+var2+"="+resultado);
        }
        else
        {
            lblNumeroMM.setText("Variable 2 es mayor que variable 1: "+var2);
            resultado=var1+var2;
            lblOp.setText(var1+"+"+var2+"="+resultado);
        }
    }

}
