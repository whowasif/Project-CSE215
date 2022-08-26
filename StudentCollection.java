package AdminStudent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
public class StudentCollection {
	
	private static ArrayList<Student> studental = new ArrayList<Student>();
	
	public StudentCollection()
	{
		
	}
	
	public void addstudent(Student student)
	{
		studental.add(student);
	}
	
	public void removeStudent(Student student)
	{
		studental.remove(student);
	}
	
	public static ArrayList<Student> getAdminCollection()
	{
		return studental;
	}
	
	public void resetStudent() {
		studental.clear();
	}

	public int getNumberOfStudent() {
		return studental.size();
	}
	
	public void printStudentCollection()
	{
		Iterator<Student> itr = studental.iterator();
		int i = 1;
		while(itr.hasNext()) {
			System.out.println(i + ". " + itr.next().getName());
			i++;
		}
	}
	
	public String printStudentInfo(Student f)
	{
		String str = "";
		Iterator<Student> itr = studental.iterator();
		Student student;
		while(itr.hasNext()) {
			student = itr.next();
			if(student.equals(f)) {
				System.out.println(student.getName());
				str = str + "Name: " + student.getName() + "\n" + "ID :" +student.getId() + "\n" +
						"Gender :" + student.getGender() + "\n" + "Email :" + student.getEmail() + "\n" + 
						"Phone Number :" + student.getPhn() + "\n" + "Institute :" + student.getInstitute() + "\n"+ "Password :" + student.getPass() + "\n" ;
				break;
			}
		}

		if(str.equals("")) {
			return "";
		}
		return str;
	}
	
	public void printinfile(Student f)
	{
		File file = new File("src/Studetails.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n");
			bw.write(f.getName());
			bw.write("  ");
			bw.write(f.getId());
			bw.write("  ");
			bw.write(f.getEmail());
			bw.write("  ");
			bw.write(f.getPhn());
			bw.write("  ");
			bw.write(f.getInstitute());
			bw.write("  ");
			bw.write(f.getGender());
			bw.write("  ");
			bw.write(f.getPass());
			bw.write("\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
