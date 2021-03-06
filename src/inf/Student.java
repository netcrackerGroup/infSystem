package inf;

import com.google.common.base.MoreObjects;

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
        rating=new HashMap<String,Integer>();
        this.course=course;

    }
    public Integer getMark(String s)
    {
        if(rating.containsKey(s))return    rating.get(s);
        else return null;
    }
    public void setMark(String s, int mark){
        rating.replace(s, mark);
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
    public void addRating(String subject, Integer value){
        rating.put(subject,value);
    }//он же и Set

    @Override
    public String toString() {
      /*  StringBuffer sb=new StringBuffer("name= "+name+" second name= "+sname+" age= "+age+" course= "+course);
        Iterator iterator=rating.values().iterator();
        sb.append("name= "+name+" second name= "+sname+" age= "+age+" course= "+course+" rating: "+rating.toString());
       */
      return MoreObjects.toStringHelper(this)
              .omitNullValues()
              .add("Name: ",name)
              .add("SName: ", sname)
              .add("Age: ", age)
              .add("Course: ",course)
              .add("Rating",rating.toString())
              .toString();
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

    @Override
    public boolean equals(Object obj) {
        Student student=(Student)obj;
        if (name.equals(student.getName())){
            if (sname.equals(student.getSname())){
                if (age==student.getAge()){
                    if (course==student.getCourse()){
                        if (rating.equals(student.rating))
                            return true;
                    }
                }
            }
        }
        return false;
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