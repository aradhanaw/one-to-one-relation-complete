package com.employeemployee.controller;
import com.employeemployee.dto.ContactDTO;
import com.employeemployee.dto.DepartmentDTO;
import com.employeemployee.model.Contact;
import com.employeemployee.service.ContactService;
import com.employeemployee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/view")

    public  String viewHomePage(Model model){
        model.addAttribute("alllistcontact",contactService.getAll());
        return "contactview";
    }

    @GetMapping("/add_con")
    public String addNewDep(Model model){
        ContactDTO contactDTO =new ContactDTO();
        model.addAttribute("contact",contactDTO);
        return "addContact";
    }
    @PostMapping("/save_con")
    public String saveEmployee(@ModelAttribute("contact") ContactDTO contactDTO){
        contactService.save(contactDTO);
        return "redirect:/view";
    }
    @GetMapping("update_con/{id}")
    public String updateForm(@PathVariable(value = "id")long id , Model model){
        ContactDTO contactDTO=contactService.getById(id);
        model.addAttribute("contact",contactDTO);
        return "updateContact";
    }
    @GetMapping("delete_con/{id}") //returning homepage so getmapping in deletemapping
    public String deleteById(@PathVariable(value = "id") long id ){
        contactService.deleteById(id);
        return "redirect:/view";
    }
    @PostMapping("updateconc/{id}")
    public  String update(@PathVariable long id , ContactDTO dto)
    {
        contactService.updateCon(id,dto);
        return "redirect:/view";
    }

}
