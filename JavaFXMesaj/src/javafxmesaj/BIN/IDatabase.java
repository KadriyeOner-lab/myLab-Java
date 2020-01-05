/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.BIN;

import javafx.collections.ObservableList;

/**
 *
 * @author kadriye
 */
public interface IDatabase<T> {

    public T get(int ID);

    public ObservableList<T> gets();

    public void update(T t);

    public void delete(T t);

    public void save(T t);

    public void saveorupdate(T t);
}
