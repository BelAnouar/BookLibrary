package org.example.Entites;

public class EmpruntEntitie {
 private int emp_id;
 private String date_emprunt;
 private String date_retourn;
 private int id;

 public EmpruntEntitie() {}
    public EmpruntEntitie(int emp_id, String date_emprunt, String date_retourn, int id) {
     this.emp_id = emp_id;
     this.date_emprunt = date_emprunt;
     this.date_retourn = date_retourn;
    }
    public EmpruntEntitie(int emp_id, String date_emprunt, String date_retourn) {
     this.emp_id = emp_id;
     this.date_emprunt = date_emprunt;
     this.date_retourn = date_retourn;
    }
    public int getEmp_id() {
     return emp_id;
    }
    public void setEmp_id(int emp_id) {
     this.emp_id = emp_id;
    }
    public String getDate_emprunt() {
     return date_emprunt;
    }
    public void setDate_emprunt(String date_emprunt) {
     this.date_emprunt = date_emprunt;
    }
    public String getDate_retourn() {
     return date_retourn;
    }
    public void setDate_retourn(String date_retourn) {
        this.date_retourn = date_retourn;
    }
 }
