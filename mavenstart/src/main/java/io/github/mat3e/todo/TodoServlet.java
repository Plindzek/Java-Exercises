package io.github.mat3e.todo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Todos", urlPatterns = {"/api/todos/*"})
/**
 * create servlet with  doGet method who's req and resp handle
 */
public class TodoServlet extends HttpServlet {
    /**
     *
     */
    private final Logger logger = LoggerFactory.getLogger(TodoServlet.class);
    private TodoRepository repository;
    private ObjectMapper mapper;

    /**
     * Servlet container needs it.
     */
    @SuppressWarnings("unused")
    public TodoServlet() {
        this(new TodoRepository(), new ObjectMapper());
    }

    TodoServlet(TodoRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        logger.info("Request got with parameters" + req.getParameterMap());
        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(), repository.findAll());
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        logger.info("Request got with path info  " + pathInfo);
        resp.setContentType("application/json;charset=UTF-8");
        Integer id = null;
        try {
            id = Integer.valueOf(req.getPathInfo().substring(1));
        } catch (NumberFormatException e) {
            logger.info("Non-numeric value " + pathInfo);
        }
        mapper.writeValue(resp.getOutputStream(), repository.toggleTodo(id));
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var newTodo = mapper.readValue(req.getInputStream(), Todo.class);
        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(), repository.addTodo(newTodo));



    }
}
