package com.tafrica.codebuffertut.controller;

import com.tafrica.codebuffertut.entity.Department;
import com.tafrica.codebuffertut.service.DepartmentService;
import com.tafrica.codebuffertut.service.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//This is the API
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);


    //method to save a department
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        //DepartmentService service = new DepartmentServiceImpl();
        LOGGER.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    //API endpoint to get all departments
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {

        return departmentService.fetchDepartmentList();

    }

    //API endpoint to get a department by ID
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);

    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully!";
    }


    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){

        return  departmentService.updateDepartment(departmentId,department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);

    }
}
