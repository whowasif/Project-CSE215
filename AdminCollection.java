package AdminAdmin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
public class AdminCollection {
	
	private static ArrayList<Admin> adminal = new ArrayList<Admin>();
	
	public AdminCollection()
	{
		
	}
	
	public void addAdmin(Admin admin)
	{
		adminal.add(admin);
	}
	
	public void removeAdmin(Admin admin)
	{
		adminal.remove(admin);
	}
	
	public static ArrayList<Admin> getAdminCollection()
	{
		return adminal;
	}
	
	public void resetAdmins() {
		adminal.clear();
	}

	public int getNumberOfAdmin() {
		return adminal.size();
	}
	
	public void printAdminCollection()
	{
		Iterator<Admin> itr = adminal.iterator();
		int i = 1;
		while(itr.hasNext()) {
			System.out.println(i + ". " + itr.next().getName());
			i++;
		}
	}
	
	public String printAdminInfo(Admin a)
	{
		String str = "";
		Iterator<Admin> itr = adminal.iterator();
		Admin admin;
		while(itr.hasNext()) {
			admin = itr.next();
			if(admin.equals(a)) {
				System.out.println(admin.getName());
				str = str + "Name: " + admin.getName() + "\n" + "ID :" +admin.getId() + "\n" +
						"Gender :" + admin.getGender() + "\n" + "Email :" + admin.getEmail() + "\n" + 
						"Phone Number :" + admin.getPhn() + "\n" + "Password :" + admin.getPass() + "\n" ;
				break;
			}
		}

		if(str.equals("")) {
			return "";
		}
		return str;
	}
	
	public void printinfile(Admin a)
	{
		File file = new File("src/Admdetails.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
		
			bw.write(a.getName());
			bw.write("  ");
			bw.write(a.getId());
			bw.write("  ");
			bw.write(a.getEmail());
			bw.write("  ");
			bw.write(a.getPhn());
			bw.write("  ");
			bw.write(a.getGender());
			bw.write("  ");
			bw.write(a.getPass());
			bw.write("\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
