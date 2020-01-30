package io.github.mat3e.todo;

import io.github.mat3e.HibernateUtil;

import java.util.List;

public class TodoRepository {

    List<Todo> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        List<Todo> result = null;
        try {
            result = session.createQuery("from Todo", Todo.class).list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
        return result;
    }

    Todo toggleTodo(Integer id) {

        Todo result = null;
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        try {
            result = session.get(Todo.class, id);
            result.setDone(!result.isDone());
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
        }

        session.close();
        return result;
    }

    Todo addTodo(Todo newTodo) {

        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        try {
            session.persist("todos", newTodo);

            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
        }

        session.close();


        return newTodo;
    }
}

