/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.BIN;

import javafx.scene.layout.HBox;

/**
 *
 * @author kadriye
 */
public abstract class Cards<T> extends HBox{
    public abstract T getData();
    public abstract  void setData(T t);
    
}
