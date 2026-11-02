package com.mycompany.bmicalculator; // Sesuaikan dengan nama package Anda

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtBerat;
    @FXML
    private TextField txtTinggi;
    @FXML
    private Label lblHasil;

    @FXML
    private void hitungBMI(ActionEvent event) {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText()) / 100.0;
            
            double bmi = berat / (tinggi * tinggi);
            String kategori = "";
            
            if (bmi < 18.5) {
                kategori = "Kurus (Underweight)";
            } else if (bmi <= 24.9) {
                kategori = "Normal";
            } else if (bmi <= 29.9) {
                kategori = "Gemuk (Overweight)";
            } else {
                kategori = "Obesitas";
            }
            
            lblHasil.setText(String.format("BMI Anda: %.1f (%s)", bmi, kategori));
        } catch (NumberFormatException e) {
            lblHasil.setText("Error: Masukkan angka yang valid!");
        }
    }
}