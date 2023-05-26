package org.example.Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfaceDAO {
    public abstract boolean introduce(Object obj) throws SQLException;
    public abstract boolean update(Object obj) throws SQLException;
    public abstract boolean delete(String id) throws SQLException;
    public abstract ArrayList getEverything() throws SQLException;
    public abstract Object searchById(String id) throws SQLException;
}
