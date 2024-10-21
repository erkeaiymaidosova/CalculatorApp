package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();
    @FXML
    private TextField inputField;

    @FXML
    private void onClickBut1() {
        String val = inputField.getText();
        val = val + "1";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut2() {
        String val = inputField.getText();
        val = val + "2";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut3() {
        String val = inputField.getText();
        val = val + "3";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut4() {
        String val = inputField.getText();
        val = val + "4";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut5() {
        String val = inputField.getText();
        val = val + "5";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut6() {
        String val = inputField.getText();
        val = val + "6";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut7() {
        String val = inputField.getText();
        val = val + "7";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut8() {
        String val = inputField.getText();
        val = val + "8";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut9() {
        String val = inputField.getText();
        val = val + "9";
        inputField.setText(val);

    }

    @FXML
    private void onClickBut0() {
        String val = inputField.getText();
        val = val + "0";
        inputField.setText(val);

    }

    @FXML
    private void onSub() {
        String op1 = inputField.getText();
        calc.setOp1(Integer.parseInt(op1));
        calc.setOperator('-');
        inputField.clear();
    }
    @FXML
    private void onMultiply() {
        String op1 = inputField.getText();
        calc.setOp1(Integer.parseInt(op1));
        calc.setOperator('*');
        inputField.clear();
    }
    @FXML
    private void onAddition() {
        String op1 = inputField.getText();
        calc.setOp1(Integer.parseInt(op1));
        calc.setOperator('+');
        inputField.clear();
    }
    @FXML
    private void onDivision() {
        String op1 = inputField.getText();
        calc.setOp1(Integer.parseInt(op1));
        calc.setOperator('/');
        inputField.clear();
    }
    @FXML
    private void onEqual() {
        String op2 = inputField.getText();
        calc.setOp2(Integer.parseInt(op2));
        calc.calculate();
        inputField.setText("" + calc.getResult());
    }
    @FXML
    private void onClear() {
        inputField.clear();
    }
}