package org.example;

import org.example.config.FactoryCondiguration;
import org.example.embed.Address;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main_1{

    public static void main(String[] args) {
        Session session= FactoryCondiguration.getInstance().getSession();
        Address address=new Address(283,"thanthirimulla","panadura");
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("perera");
        teacher.setAddress(address);


        /*open transaction*/
        Transaction transaction=session.beginTransaction();

        session.save(teacher);
        //session.update(teacher);
        //session.delete(teacher);
        //session.get(Teacher.class,1);
        transaction.commit();
        session.close();
    }

}

