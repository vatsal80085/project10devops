package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

@WebServlet("/wordcount")
public class WordCountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("text");
        
        WordCountService service = new WordCountService();
        int letterCount = service.LetterCount(text);
        int numberCount = service.NumberCount(text);
        int spaceCount = service.SpaceCount(text);
        
        Result result = new Result(letterCount, numberCount, spaceCount);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(result));
    }
    
    class Result {
        int letterCount;
        int numberCount;
        int spaceCount;
        
        Result(int letterCount, int numberCount, int spaceCount) {
            this.letterCount = letterCount;
            this.numberCount = numberCount;
            this.spaceCount = spaceCount;
        }
    }
}

