/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.BIN;

import Pojo.DataType;

/**
 *
 * @author kadriye
 */
public interface ICards<T extends DataType> {
    
    public T getData();
    public void setData(T t);
    
}
