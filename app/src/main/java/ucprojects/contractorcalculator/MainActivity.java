package ucprojects.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText txtLabor = (EditText) findViewById(R.id.txtLaborCost);
        EditText txtMatCost = (EditText) findViewById(R.id.txtMaterialCost);
        double laborCost = Double.parseDouble(txtLabor.getText().toString());
        double materialCost = Double.parseDouble(txtMatCost.getText().toString());
        double subTotal = laborCost + materialCost;
        double tax = subTotal * 0.05;
        double total = subTotal + tax;
        TextView txvSubTotal = (TextView) findViewById(R.id.txvSubTotal);
        TextView txvTax = (TextView) findViewById(R.id.txvTax);
        TextView txvTotal = (TextView) findViewById(R.id.txvTotal);
        DecimalFormat df = new DecimalFormat("#.##");
        txvSubTotal.setText("$"+df.format(subTotal));
        txvTax.setText("$"+df.format(tax));
        txvTotal.setText("$"+df.format(total));
    }
}