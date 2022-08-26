package Adminfaculty;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
public class FacultyCollection {
	
	private static ArrayList<Faculty> facultyal = new ArrayList<Faculty>();
	
	public FacultyCollection()
	{
		
	}
	
	public void addfaculty(Faculty faculty)
	{
		facultyal.add(faculty);
	}
	
	public void removeFaculty(Faculty faculty)
	{
		facultyal.remove(faculty);
	}
	
	public static ArrayList<Faculty> getAdminCollection()
	{
		return facultyal;
	}
	
	public void resetFaculty() {
		facultyal.clear();
	}

	public int getNumberOfFaculty() {
		return facultyal.size();
	}
	
	public void printFacultyCollection()
	{
		Iterator<Faculty> itr = facultyal.iterator();
		int i = 1;
		while(itr.hasNext()) {
			System.out.println(i + ". " + itr.next().getName());
			i++;
		}
	}
	
	public String printFacultyInfo(Faculty f)
	{
		String str = "";
		Iterator<Faculty> itr = facultyal.iterator();
		Faculty faculty;
		while(itr.hasNext()) {
			faculty = itr.next();
			if(faculty.equals(f)) {
				System.out.println(faculty.getName());
				str = str + "Name: " + faculty.getName() + "\n" + "ID :" +faculty.getId() + "\n" +
						"Gender :" + faculty.getGender() + "\n" + "Email :" + faculty.getEmail() + "\n" + 
						"Phone Number :" + faculty.getPhn() + "\n" + "Password :" + faculty.getPass() + "\n" ;
				break;
			}
		}

		if(str.equals("")) {
			return "";
		}
		return str;
	}
	
	public void printinfile(Faculty f)
	{
		File file = new File("src/Facdetails.txt");
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
