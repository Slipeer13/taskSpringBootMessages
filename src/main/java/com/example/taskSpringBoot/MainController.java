package com.example.taskSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class MainController {
    private String name;
    @Autowired
    private MessagesRepository messagesRepository;

    @RequestMapping(value = "/")
    public String getIndexPage(Model model) {
        return "index";
    }

    @RequestMapping(value = "/message")
    public String newMessage(@RequestParam(name="name",required = false, defaultValue = "") String name, Model model) {
        if (name == null || name.equals("")) {
            if(this.name == null) {
                return "redirect:/";
            }
            else {
                model.addAttribute("name", this.name);
                model.addAttribute("message", new Messages());
                model.addAttribute("allMessage", messagesRepository.findAll(this.name));
            }
        }
        else {
            this.name = name;
            model.addAttribute("name", name);
            model.addAttribute("message", new Messages());
            model.addAttribute("allMessage", messagesRepository.findAll(this.name));
        }
        return "new_message";
    }

    @RequestMapping(value = "/save")
    public String saveSale(@ModelAttribute("message") Messages messages) {
        messages.setName(name);
        messagesRepository.save(messages);
        return "redirect:/message";
    }

}
