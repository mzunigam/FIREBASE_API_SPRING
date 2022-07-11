package api.web.firebase.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class AppController {
    
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView(new View() {

            @Override
            public void render(Map<String, ?> arg0, HttpServletRequest arg1, HttpServletResponse arg2)
                    throws Exception {
                arg2.getWriter().write("API FIREBASE WITH SPRING\n");
                arg2.getWriter().write("-------------------------\n");
                arg2.getWriter().write("Entities : /user/api/, /report/api/, /check/api/ \n");
                arg2.getWriter().write("-------------------------\n");
                arg2.getWriter().write("/api/save/null to save a new object\n");
                arg2.getWriter().write("/api/save/{id} to update an object\n");
                arg2.getWriter().write("/api/find/{id} to find an object by id\n");
                arg2.getWriter().write("/api/findall/ to find all\n");
                arg2.getWriter().write("/api/delete/{id} to delete an object by id\n");
                arg2.getWriter().write("/api/deleteall/ to delete all\n");
            }
            
        });
    }

}
