package AdminCourse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
public class CourseCollection {
	
	private static ArrayList<Course> courseal = new ArrayList<Course>();
	
	public CourseCollection()
	{
		
	}
	
	public void addCourse(Course course)
	{
		courseal.add(course);
	}
	
	public void removeCourse(Course course)
	{
		courseal.remove(course);
	}
	
	public static ArrayList<Course> getAdminCollection()
	{
		return courseal;
	}
	
	public void resetCourse() {
		courseal.clear();
	}

	public int getNumberOfCourse() {
		return courseal.size();
	}
	
	public void printCourseCollection()
	{
		Iterator<Course> itr = courseal.iterator();
		int i = 1;
		while(itr.hasNext()) {
			System.out.println(i + ". " + itr.next().getName());
			i++;
		}
	}
	
	public String printCourseInfo(Course f)
	{
		String str = "";
		Iterator<Course> itr = courseal.iterator();
		Course course;
		while(itr.hasNext()) {
			course = itr.next();
			if(course.equals(f)) {
				System.out.println(course.getName());
				str = str + "Name: " + course.getName() + "\n" + "Intial :" +course.getIntial() + "\n" +
						"Credit :" + course.getCredit()  + "\n"+"Faculty :" + course.getFaculty()  + "\n" ;
				break;
			}
		}

		if(str.equals("")) {
			return "";
		}
		return str;
	}
	
	public void printinfile(Course f)
	{
		File file = new File("src/Studetails.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n");
			bw.write(f.getName());
			bw.write("  ");
			bw.write(f.getIntial());
			bw.write("  ");
			bw.write(f.getCredit());
			bw.write("  ");
			bw.write(f.getFaculty());
			
			bw.write("\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
