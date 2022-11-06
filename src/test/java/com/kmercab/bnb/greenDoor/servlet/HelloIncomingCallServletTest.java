package com.kmercab.bnb.greenDoor.servlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class HelloIncomingCallServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_get_digit_when_call_get() throws IOException, ServletException {

        //when(request.getParameter("fn")).thenReturn("Vinod");
        //when(request.getParameter("ln")).thenReturn("Kashyap");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        when(response.getWriter()).thenReturn(pw);

        HelloIncomingCallServlet myServlet =new HelloIncomingCallServlet();
        myServlet.doGet(request, response);
        String result = sw.getBuffer().toString().trim();
        assertEquals(result, new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Play digits=\"wwww5\"/></Response>"));

    }
}