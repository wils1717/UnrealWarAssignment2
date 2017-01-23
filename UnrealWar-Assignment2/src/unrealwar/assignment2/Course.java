/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

/**
 *
 * @author c0533886
 */
public class Course {

    public Course() {

    }

    public Course(String name) {

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
            return (s.getId().equals()); //FIX
        } else {
            return false;
        }
    }

    /* @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("weightCapacity", weightCapacity);
        json.put("productId", productId);
        json.put("name", name);
        json.put("width", width);
        json.put("length", length);
        json.put("description", description);
        json.put("stockQuantity", stockQuantity);
        json.put("packageQuantity", packageQuantity);
        json.put("warehouse", warehouse);
        json.put("stockPrice", stockPrice);
        json.put("height", height);
        return json.toJSONString();
    } */
    public void getAllbyGender(String gender) {

    }

    public void getGradeMap() {

    }
}
