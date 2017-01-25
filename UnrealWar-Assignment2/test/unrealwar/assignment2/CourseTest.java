/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
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

    List<Student> studentList;
    
    public CourseTest(){
    }
    
    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Bob", "ABC123", "Male", 65));
        studentList.add(new Student("Jim", "ABC124", "Male", 60));
               
    }
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
            instance2.setId("c0123567");
            instance2.setGender("female");
            instance2.setGrade(92.4);
            Student instance3 = new Student();
            instance3.setName("Ranbir Singh");
            instance3.setId("c0123890");
            instance3.setGender("male");
            instance3.setGrade(87.1);
            Course c = new Course();
            c.add (instance1);
            c.add (instance2);
            c.add (instance3);
            JSONArray result = (JSONArray) new JSONParser().parse(c.toString());
            JSONArray expResult = (JSONArray) new JSONParser().parse("[{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 },\n"
                    +     "{ \"name\" : \"Suzie Chen\", \"id\" : \"c0123567\", \"gender\" : \"female\", \"grade\" : 92.4 },\n"
                    +     "{ \"name\" : \"Ranbir Singh\", \"id\" : \"c0123890\", \"gender\" : \"male\", \"grade\" : 87.1 }]");
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.err.println("Invalid JSON Format");
            fail("Invalid JSON Format");
        }
    }
    
    
////    @Test
//    public void testCourseConstructorWithListParamater() {
//        Course instance = new Course(studentList);
//        Student result = ;
//        Student expResult = new Student();
//        assertEquals(expResult, result);
//    }
    
    /*Test for 
    After calling the Course constructor with a List parameter, and using get() 
    with a given id String of a valid student, a Student object with the correct 
    id, name, gender and grade should be returned.*/ 
    
    @Test
    public void testCanGetStudentFromList() {
        Course instance = new Course(studentList);
        Student result = instance.get("ABC555");
        Student expResult = new Student("Bob", "ABC555", "male", 60);
        assertEquals(expResult, result);
    }
    
    /* Test for
    After calling the Course constructor with a List parameter, and using get() 
    with a given id String of an invalid student, a null pointer should be 
    returned.*/   
    
    @Test
    public void testInvalidStudentId() {
        Course instance = new Course(studentList);
        Student result = instance.get("ABC555");
        Student expResult = null;
        assertEquals(expResult, result);
    }
    
    
}
