package inf;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student implements Serializable {
    private String name;
    private String sname;
    private int age;
    private int course;
<<<<<<< HEAD
    private HashMap<String,Integer> rating=new HashMap();
=======
    private HashMap<String,Integer> rating;
>>>>>>> 5022cca9e39db5dac99188610ad504664c8486dd
    public Student(String name, String sname, int age, int course){
        this.age=age;
        this.name=name;
        this.sname=sname;
<<<<<<< HEAD
        rating=new HashMap<String,Integer>()
        rating.put(null,null);
    }
    public Integer getMark(String s)
    {
        if(registers.containsKey(s))return    registers.get(s);
=======
        rating=new HashMap<String,Integer>();
        rating.put(null,null);
        this.course=course;
    }
    public Integer getMark(String s)
    {
        if(rating.containsKey(s))return    rating.get(s);
>>>>>>> 5022cca9e39db5dac99188610ad504664c8486dd
        else return null;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSname() {
        return sname;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSname(String sname){
        this.sname=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setRating(HashMap<String, Integer> rating) {
        this.rating = rating;
    }

    public HashMap<String, Integer> getRating() {
        return rating;
    }

    public int getCourse() {
        return course;
    }
<<<<<<< HEAD
    public void addRaiting(String subject, Integer value){
=======
    public void addRating(String subject, Integer value){
>>>>>>> 5022cca9e39db5dac99188610ad504664c8486dd
        rating.put(subject,value);
    }//он же и Set

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer("name= "+name+" second name= "+sname+" age= "+age+" course= "+course);
        Iterator iterator=rating.values().iterator();
        sb.append("name= "+name+" second name= "+sname+" age= "+age+" course= "+course+" rating: ");
        while (iterator.hasNext()){
            sb.append(rating.toString());
        }
        return sb.toString();
    }

    public Set<String> getSubjects() {
        return rating.keySet();
    }
    public Collection<Integer> getMarks() {
        return rating.values();
    }
    public int getSize()
    {
        return rating.size();
    }
}

/*package inf;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public class Student implements Serializable {
    private String name;
    private String sname;
    private int age;
    public int course;
    private HashMap<String,String> rating=new HashMap();
    public Student(String name, String sname, int age, int course){
        this.age=age;
        this.name=name;
        this.sname=sname;
    }
    public void setSubjectRating(String subject, String rating){
        this.rating.put(subject,rating);
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname){
        this.sname=name;
    }
    public String getRating(String subject){
        return  rating.get(subject);
    }
    public void setRating(HashMap<String, String> rating) {
        this.rating = rating;
    }
    public HashMap<String, String> getRating() {
        return rating;
    }
    public void addRating(String subject, String value){
        rating.put(subject,value);
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public int getCourse() {
        return course;
    }
       @Override
    public String toString() {
        StringBuffer sb=new StringBuffer("name= "+name+" second name= "+sname+" age= "+age+" course= "+course);
        Iterator iterator=rating.values().iterator();
        sb.append("name= "+name+" second name= "+sname+" age= "+age+" course= "+course+" rating: ");
      while (iterator.hasNext()){
          sb.append(rating.toString());
      }
      return sb.toString();
    }

    public Set<String> getSubjects() {
        return rating.keySet();
    }
    public Collection<Integer> getMarks() {
        return registers.values();
    }
    public int getSize()
    {
        return rating.size();
    }
}
*/