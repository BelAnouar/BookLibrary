package org.example.Entites;

public class MemberEntitie {
    private int id;
    private String name;
    private String prenom;
    private String num_member;

    public MemberEntitie() {  }
    public MemberEntitie(int id, String name, String prenom, String num_member) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.num_member = num_member;
    }
    public MemberEntitie( String name, String prenom, String num_member) {
        this.name = name;
        this.prenom = prenom;
        this.num_member = num_member;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom=prenom;
    }
    public String getNum_member() {
        return this.num_member;
    }
    public void setNum_member(String num_member) {
        this.num_member = num_member;
    }
}
