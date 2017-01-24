/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/**
 *
 * @author c0533886
 */
public class Course {

    private List<Student> students;

    public Course() {
        students = new ArrayList<>();
    }

    public Course(List<Student> students) {

        this.students = students;

    }

    public void add(Student s) {
        students.add(s);
    }

    public void remove(Student student) {

    }

    public void remove(String id) {

    }

    public void remove(int position) {

    }

    public void insert(Student student, int position) {

    }

    public Student get(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public Student get(int position) {
        return students.get(position);
    }

//    public Student getAll() {
//        
//       
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return (s.getId().equals(s.id));
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        JsonArray jsonArray = new JsonArray();
        JsonParser parser = new JsonParser();
        for (Student s : students) {
            JsonElement jsonObj = parser.parse(s.toString());
            jsonArray.add(jsonObj);
        }
        return jsonArray.toString();
    }

    public void getAllbyGender(String gender) {

    }

    public void getGradeMap() {

    }
}
