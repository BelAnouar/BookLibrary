package org.example.DAO.implemantations;

public interface EmpruntImp {
    public boolean addEmprunt(EmpruntImp emprunt);
    public boolean removeEmprunt(EmpruntImp emprunt);
    public EmpruntImp getEmprunt(int id);
    public boolean updateEmprunt(EmpruntImp emprunt);
}
