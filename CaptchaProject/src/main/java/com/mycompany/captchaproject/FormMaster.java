/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.captchaproject;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.captcha.botdetect.web.servlet.Captcha;

/**
 *
 * @author odehe
 */
//@WebServlet(name="FormMaster", urlPatterns={"/FormMaster"})
public class FormMaster extends HttpServlet {

    HttpSession session;
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormMaster</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormMaster at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    } **/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, String> messages = new HashMap<String, String>();
        request.setAttribute("messages", messages);
        
        Captcha captcha = Captcha.load(request, "formCaptcha");
        boolean messageValid = true;
        String destinationPage = "/index.jsp";

        session = request.getSession(true);

        if (session.getAttribute("isCaptchaSolved") == null) {
            // validate the Captcha to check we're not dealing with a bot
            boolean isHuman = captcha.validate(request.getParameter("captchaCode"));
            if (isHuman) {
                // Captcha validation passed, perform protected action
                session.setAttribute("isCaptchaSolved", true);
            } else {
                // Captcha validation failed, show error message
                messages.put("captchaIncorrect", "Wrong! Please try again!");
                messages.put("msg", "Redo Captcha please.");
                messageValid = false;
            }
        }

        if (!isValidName(request.getParameter("name"))) {
            messages.put("msg", "Enter a valid name!");
            messageValid = false;
        }

        if (!isValidEmail(request.getParameter("email"))) {
            messages.put("msg", "Enter valid email address!");
            messageValid = false;
        }

        if (!isPhoneValid(request.getParameter("phone"))) {
            messages.put("msg", "Enter valid phone number!");
            messageValid = false;
        }

        if (!isPasswordValid(request.getParameter("password"))) {
            messages.put("msg", "Password less than five characters wrong!");
            messageValid = false;
        }

        /**if (!isValidMessage(request.getParameter("message"))) {
            messages.put("messageIncorrect", "*");
            messageValid = false;
        }*/

        if (messageValid) {
            saveMessage(request.getParameter("name"), request.getParameter("email"), 
                        request.getParameter("phone"), request.getParameter("password"));
            session.removeAttribute("isCaptchaSolved");
            destinationPage = "/next.jsp";
        }
        session.setAttribute("msg", messages.get("msg"));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
        dispatcher.forward(request, response);
    }

    private boolean isValidName(String name) {
        if (name == null) {
            return false;
        }
        return name.length() > 2 && name.length() < 30;
    }

    private boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }

    private boolean isValidMessage(String message) {
        if (message == null) {
            return false;
        }
        return (message.length() > 2) && (message.length() < 255);
    }

    private boolean isPasswordValid(String password) {
        if (password == null) {
            return false;
        }
        return (password.length() > 4);
    }

    private boolean isPhoneValid(String phone) {
        if (phone == null) {
            return false;
        }
        return (phone.length() > 9) && (phone.length() < 15);
    }

    private void saveMessage(String name, String email, String phone, String password) {
        Date timeStamp = new Date();
        //String message = name + " (" + email + ") says: " + messageText;
        session.setAttribute("time", timeStamp.getTime());
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("phone", phone);
        session.setAttribute("password", password);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
