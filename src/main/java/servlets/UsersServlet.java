package servlets;

import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersServlet extends HttpServlet {
//    @SuppressWarnings({"FieldCanBeLocal", "UnusedDeclaration"})
    private final AccountService accountService;

    public UsersServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    public void doGet(HttpServletResponse response,
                      HttpServletRequest request) throws ServletException, IOException {

    }

    public void doPost(HttpServletResponse response,
                       HttpServletRequest request) throws ServletException, IOException {

    }

    public void doPut(HttpServletResponse response,
                      HttpServletRequest request) throws ServletException, IOException {

    }

    public void doDelete(HttpServletResponse response,
                         HttpServletRequest request) throws ServletException, IOException {

    }


}




