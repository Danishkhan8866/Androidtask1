import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmployeeId, editTextEmployeeName, editTextDesignation,
            editTextGrossSalary, editTextIncomeTax, editTextProvidentFund, editTextProfessionalTax;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmployeeId = findViewById(R.id.editTextEmployeeId);
        editTextEmployeeName = findViewById(R.id.editTextEmployeeName);
        editTextDesignation = findViewById(R.id.editTextDesignation);
        editTextGrossSalary = findViewById(R.id.editTextGrossSalary);
        editTextIncomeTax = findViewById(R.id.editTextIncomeTax);
        editTextProvidentFund = findViewById(R.id.editTextProvidentFund);
        editTextProfessionalTax = findViewById(R.id.editTextProfessionalTax);
        textViewResult = findViewById(R.id.textViewResult);

        Button calculateButton = findViewById(R.id.buttonCalculate);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSalary();
            }
        });
    }

    private void calculateSalary() {
        double grossSalary = Double.parseDouble(editTextGrossSalary.getText().toString());
        double incomeTax = Double.parseDouble(editTextIncomeTax.getText().toString());
        double providentFund = Double.parseDouble(editTextProvidentFund.getText().toString());
        double professionalTax = Double.parseDouble(editTextProfessionalTax.getText().toString());

        // Calculate net salary after deductions
        double netSalary = grossSalary - (incomeTax + providentFund + professionalTax);

        textViewResult.setText("Net Salary: $" + String.format("%.2f", netSalary));
    }
}