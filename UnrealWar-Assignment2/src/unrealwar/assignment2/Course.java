/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
/**
 *
 * @author c0533886
 */
public class Course extends Student {

    List<Student> students = new ArrayList<>();

    public Course() {
        students = new ArrayList<>();
    }

    public Course(List<Student> students) {

        this.students = students;

    }

    public void add(Student student) {

    }

    public void remove(Student student) {

    }

    public void remove(String id) {

    }

    public void remove(int position) {

    }

    public void insert(Student student, int position) {

    }

    public void get(String id) {

    }

    public void get(int position) {

    }

    public void getAll() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return (s.getId().equals(id)); 
        } else {
            return false;
        }
    }

     @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("id", id);
        json.put("gender", gender);
        json.put("grade", grade);
        return json.toJSONString();
    }
    public void getAllbyGender(String gender) {

    }

    public void getGradeMap() {

    }
}
