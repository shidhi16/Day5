package DAY5;

import java.util.Date;

public class Day5InheritanceExample
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setFname("Shivani");
        s1.setLname("Dhiman");
        s1.setSid("751731");
        s1.setCourse("Mobile Application Design & Development");
        s1.setEmail("shivanidhiman1619@gmail.com");
        s1.setBirthdate(new Date(1994,2,8));
        s1.getMarksof5sub("50,65,68,78,52");
        s1.setTotal(new S);

        Faculty f1 = new Faculty();
        f1.setId("2154");
        f1.setFname("Pritesh");
        f1.setLname("Patel");
        f1.setEmail("moxdroidlabs@gmail.com");
        f1.setDepartment("Mobile Application Design & Development");
        f1.setDesignation("Senior Developer");
        f1.setJoiningdate(new Date(2019, 3, 1));
    }
}
