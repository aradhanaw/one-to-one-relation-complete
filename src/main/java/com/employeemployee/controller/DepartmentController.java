package com.employeemployee.controller;


import com.employeemployee.dto.DepartmentDTO;
import com.employeemployee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/index")

    public  String viewHomePage(Model model){
        model.addAttribute("alllist",departmentService.getAll());
        return "departmentindex";
    }

    @GetMapping("/add_dep")
    public String addNewDep(Model model){
        DepartmentDTO departmentDTO =new DepartmentDTO();
        model.addAttribute("department",departmentDTO);
        return "addDepartment";
    }
    @PostMapping("/save_dep")
    public String saveEmployee(@ModelAttribute("department") DepartmentDTO departmentDTO){
        departmentService.save(departmentDTO);
        return "redirect:/index";
    }
    @GetMapping("update_dep/{id}")
    public String updateForm(@PathVariable(value = "id")long id , Model model){
        DepartmentDTO departmentDTO=departmentService.getById(id);
        model.addAttribute("department",departmentDTO);
        return "updateDep";
    }
    @GetMapping("delete_dep/{id}") //returnig homepage so getmapping in deletemapping
    public String deleteById(@PathVariable(value = "id") long id ){
        departmentService.deleteById(id);
        return "redirect:/";
    }
    @PostMapping("updatedep/{id}")
    public  String update(@PathVariable long id , DepartmentDTO dto)
    {
       departmentService.updateDep(id,dto);
        return "redirect:/index";
    }

}
