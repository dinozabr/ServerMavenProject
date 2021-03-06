package servlets;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class AllRequestsServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Object> pageVariables = createPageVariablesMap(req);

        String message = req.getParameter("message");

        resp.setContentType("text/html;charset=utf-8");

        if (message == null || message.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);

        } else {
            resp.setStatus(HttpServletResponse.SC_OK);
        }
        pageVariables.put("message", message == null ? "" : message);

//        resp.getWriter().println(PageGenerator.instance().getPage("index.html", pageVariables));


    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /// change args on createPageVariablesMap
        Map<String, Object> pageVariables = createPageVariablesMap(req);
        String message = req.getParameter("key");

        HttpSession session = req.getSession();
//        Long userId = (Long) session.getAttribute("userId");
//
//        if (userId == null) {
//            userId = userIdGenerator.getAndIncrement();
//            session.setAttribute("userId", userId);
//        }

        String key = session.toString();
        

        resp.setContentType("text/html;charset=utf-8");
        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.getWriter().println(PageGenerator.instance().getPage("index.html", pageVariables));

    }

    private static Map<String, Object> createPageVariablesMap(HttpServletRequest request) {
        Map<String, Object> pageVariables = new HashMap<String, Object>();
        pageVariables.put("method", request.getMethod());
        pageVariables.put("URL", request.getRequestURI().toString());
        pageVariables.put("pathInfo", request.getPathInfo());
        pageVariables.put("sessionId", request.getSession().getId());
        pageVariables.put("parameters", request.getParameterMap().toString());
        return pageVariables;
    }
}
