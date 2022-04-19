/*
    GUARDADO TRIANGULOS HEROKU HTML :   AppController
    AUTORA                          :   Maria Tchijov Cruz
    FECHA                           :   19 abr 2022
    Controlador de la aplicación
 */

package net.codejava.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import net.codejava.entity.Triangle;
import net.codejava.services.TriangleService;
import net.codejava.entity.TriangleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private TriangleService service;

    @RequestMapping("/")
    public String verCalculos(Model model) 
    {
        List<TriangleEntity> listTriangles = service.listAll();
        model.addAttribute("listTriangles", listTriangles);
        return "index";
    }
    
    @RequestMapping("/calculo")
    public String calculoRealizado(HttpSession session) 
    {
        session.setAttribute("mySessionAttribute", "sasas");
        return "redirect:/";
    }
    
    @RequestMapping("/new")
    public String nuevoCalculo(Model model) 
    {
        TriangleEntity triangle = new TriangleEntity();
        model.addAttribute("triangle", triangle);
        return "calculos";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("triangle") TriangleEntity triangle) 
    {
        triangle.setPerimetro(3.0 * triangle.getBase());
        triangle.setArea((triangle.getBase() * triangle.getAltura()) / 2.0);
        service.save(triangle);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) 
    {
        service.delete(id);
        return "redirect:/";
    }
}
