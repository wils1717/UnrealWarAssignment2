/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0121833
 */
public class CourseTest {

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            Student instance1 = new Student();
            instance1.setName("Bill Smith");
            instance1.setId("c0123456");
            instance1.setGender("male");
            instance1.setGrade(89.3);
            Student instance2 = new Student();
            instance2.setName("Suzie Chen");
            instance2.setId("c0123467");
            instance2.setGender("female");
            instance2.setGrade(92.4);
            Student instance3 = new Student();
            instance2.setName("Ranbir Singh");
            instance2.setId("c0123890");
            instance2.setGender("male");
            instance2.setGrade(87.1);
            String jsonString1 = instance1.toString();
            String jsonString2 = instance2.toString();
            String jsonString3 = instance3.toString();
            JSONObject result = (JSONObject) new JSONParser().parse(jsonString1 + jsonString2 + jsonString3);
            JSONObject expResult = (JSONObject) new JSONParser().parse("{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 }"
                    +     "{ \"name\" : \"Suzie Chen\", \"id\" : \"c0123567\", \"gender\" : \"female\", \"grade\" : 92.4 }"
                    +     "{ \"name\" : \"Ranbir Singh\", \"id\" : \"c0123890\", \"gender\" : \"male\", \"grade\" : 87.1 }");
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.err.println("Invalid JSON Format");
            fail("Invalid JSON Format");
        }
    }

    @Test
    public void testListParameter() {  
        System.out.println("Course(...)");
        List students = new ArrayList();
        students.add("s");
        Course instance = new Course(students);         
        assertEquals(students, instance.getAll());
    }
    
    /*@Test
    public void testAddStudentParameter() {
       System.out.println("Course(...)");
        Student students = null;
        
        students.add("s");
        Course instance = new Course();    

        assertEquals(instance, instance.getAll());
    }*/
    
    
    
}
