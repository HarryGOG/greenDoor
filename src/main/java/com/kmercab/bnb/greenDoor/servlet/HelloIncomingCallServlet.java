package com.kmercab.bnb.greenDoor.servlet;

import com.twilio.twiml.voice.Play;
import com.twilio.twiml.VoiceResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
//@WebServlet("/voice")
public class HelloIncomingCallServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/xml");
        Play play = new Play.Builder("").digits("wwww5").build();
        VoiceResponse twiml = new VoiceResponse.Builder().play(play).build();

        PrintWriter out = response.getWriter();
        out.println(twiml.toXml());
    }
/*    private static final long serialVersionUID = 1L;
    // Handle HTTP POST to /voice
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Play play = new Play.Builder("").digits("wwww5").build();
        VoiceResponse twiml = new VoiceResponse.Builder().play(play).build();


        response.setContentType("text/xml");

        try {
            response.getWriter().print(twiml.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }*/
}

/*
public class HelloStateServlet extends HttpServlet   {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello Uttar Pradesh!</h3>");
    }
} */
