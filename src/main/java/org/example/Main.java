package org.example;

import org.example.config.FactoryCondiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryCondiguration.getInstance().getSession();
        FullName fullName=new FullName("Lihini","Apsara");
        Student student=new Student();
        student.setId(1);
        student.setFullname(fullName);
        student.setAddress("Panadura");
        //open transaction
        Transaction transaction=session.beginTransaction();

//        session.save(student);
        //session.update(student);
        //session.delete(student);
        session.get(Student.class,1);
        transaction.commit();
        session.close();


    }
}