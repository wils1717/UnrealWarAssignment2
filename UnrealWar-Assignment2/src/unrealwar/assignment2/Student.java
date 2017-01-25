

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

import java.util.Objects;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author c0533886
 */
public class Student {
     String name;
     String id;
     String gender;
     double grade;
    
    public Student() {
        this.name = " ";
        this.id = " ";
        this.gender = " ";
        this.grade = 0;
    }
    
    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return (s.getId().equals(id)) && (s.getName().equals(name));
        }
        else return false;
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
}
