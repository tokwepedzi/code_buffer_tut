package com.tafrica.codebuffertut.service;

import com.tafrica.codebuffertut.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();


    public Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
