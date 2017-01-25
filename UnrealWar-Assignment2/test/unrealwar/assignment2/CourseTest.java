/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrealwar.assignment2;

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
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student s = null;
        Course instance = new Course();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Student student = null;
        int position = 0;
        Course instance = new Course();
        instance.insert(student, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    /**
     * Test of getAllbyGender method, of class Course.
     */
    @Test
    public void testGetAllbyGender() {
        System.out.println("getAllbyGender");
        String gender = "";
        Course instance = new Course();
        instance.getAllbyGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        Course instance = new Course();
        instance.getGradeMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
