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

    public CourseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Bob", "ABC123", "Male", 65));
        studentList.add(new Student("Jim", "ABC124", "Male", 60));

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAllWithArg() {
        System.out.println("testGetAllWithArg");
        Course instance = new Course(studentList);

        List<Student> result = instance.getAll();
        assertEquals(studentList, result);
    }

    /**
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = new Student("Bob", "ABC123", "Male", 65);
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        Course instance = new Course();
        instance.add(student);
        List<Student> result = instance.getAll();

        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int position = 0;
        Course instance = new Course();
        instance.remove(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");

        int position = 0;

        Student result = new Student("Bob", "ABC123", "Male", 65);
        Course instance = new Course(studentList);
        instance.insert(result, position);
        boolean found = instance.getAll().contains(result);
        assertTrue(found);

    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String id = "";
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
            c.add(instance1);
            c.add(instance2);
            c.add(instance3);
            JSONArray result = (JSONArray) new JSONParser().parse(c.toString());
            JSONArray expResult = (JSONArray) new JSONParser().parse("[{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 },\n"
                    + "{ \"name\" : \"Suzie Chen\", \"id\" : \"c0123567\", \"gender\" : \"female\", \"grade\" : 92.4 },\n"
                    + "{ \"name\" : \"Ranbir Singh\", \"id\" : \"c0123890\", \"gender\" : \"male\", \"grade\" : 87.1 }]");
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
