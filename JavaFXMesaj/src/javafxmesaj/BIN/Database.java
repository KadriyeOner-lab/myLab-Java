/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.BIN;

import Pojo.NewHibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author kadriyes
 */
public class Database {

    private SessionFactory sessionFactory;

    public void connect() {

        sessionFactory = NewHibernateUtil.getSessionFactory();

    }

    public void disconnected() {
        sessionFactory.close();
    }

}
