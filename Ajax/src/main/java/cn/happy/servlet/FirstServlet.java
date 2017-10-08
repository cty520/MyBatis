package cn.happy.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.server.ServerCloneException;

/**
 * Created by adminastrator on 2017/10/5.
 */
public class FirstServlet  extends  HttpServlet{
    protected  void dopost(HttpServletRequest request, HttpServletResponse response)throws ServerCloneException,IOException{
        String uname=request.getParameter("uname");
        if (uname.equals("admin")) {
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }
    }

}
