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
    private HashMap<String,Integer> rating=new HashMap();
    public Student(String name, String sname, int age, int course){
        this.age=age;
        this.name=name;
        this.sname=sname;
        rating=new HashMap<String,Integer>()
        rating.put(null,null);
    }
    public Integer getMark(String s)
    {
        if(registers.containsKey(s))return    registers.get(s);
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
    public void addRaiting(String subject, Integer value){
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
        return registers.values();
    }
    public int getSize()
    {
        return rating.size();
    }
}