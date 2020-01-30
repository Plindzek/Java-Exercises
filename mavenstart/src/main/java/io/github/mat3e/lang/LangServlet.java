package io.github.mat3e.lang;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Lang", urlPatterns = {"/api/langs"})
/**
 * create servlet with  doGet method who's req and resp handle
 */
public class LangServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Logger logger = LoggerFactory.getLogger(LangServlet.class);
    private LangService service;
    private ObjectMapper mapper;

    /**
     * Servlet container needs it.
     */
    @SuppressWarnings("unused")
    public LangServlet() {
        this(new LangService(), new ObjectMapper());
    }

    LangServlet(LangService service, ObjectMapper mapper) {
        this.service=service;
        this.mapper=mapper;
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        logger.info("Request got with parameters" + req.getParameterMap());
        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(), service.findAll());


    }

}
