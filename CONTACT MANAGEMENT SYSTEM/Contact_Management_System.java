//$$$   CONTACT MANAGEMENT SYSTEM ~ 2023   $$$

import java.util.*;
import java.io.*;
public class Contact_Management_System {

// @ Function Calling
public static void main(String args[]){
Scanner str = new Scanner(System.in);
Scanner log = new Scanner(System.in);
Scanner in = new Scanner(System.in);
for(int i = 0;i < 10;i++){
ShowContact_Details();
System.out.print("Choose the Option: ");
int option = in.nextInt();
if(option == 1){
Create_NewContact();
}
else if(option == 2){
Contact_Details();
}
else if(option == 3){
Edit_Contact();
}
else if(option == 4){
Delete_Contact();
}
else if(option == 5){
Exit();
i = 11;
}
else{
System.out.println("Please Check the Option\nReEnter the Options: ");
}
}
}
public static void ShowContact_Details(){
System.out.println("\t\t>>> Contact Management System ~ 2023 <<<\n");
System.out.print("\t1. Create NewContact\n\t2. Contact Details\n\t3. Edit Contact\n\t4. Delete Contact\n\t5. Exit\n\n");
}

// @ Create New Contact
public static void Create_NewContact(){
try{
System.out.println("\t\t>>> Create New Contact ~ 2023 <<<\n\n");
Scanner str = new Scanner(System.in);
Scanner log = new Scanner(System.in);
Scanner in = new Scanner(System.in);
System.out.print("Enter the Name: ");
String Name = str.nextLine();
System.out.print("Enter the Company: ");
String Company = str.nextLine();
System.out.print("Enter the Title: ");
String Title = str.nextLine();
System.out.print("Enter the Phone Number: ");
long Phone_Number = log.nextLong();
System.out.print("Enter the Email: ");
String Email = str.nextLine();
System.out.print("Enter the Notes: ");
String Notes = str.nextLine();
File file = new File(Name+".txt");
if(file.createNewFile()){
FileWriter writer = new FileWriter(Name+".txt");
writer.write("Name: "+Name+"\nCompany: "+Company+"\nTitle: "+Title+"\nPhone Number: "+Phone_Number+"\nEmail: "+Email+"\nNotes: "+Notes);
writer.close();
}
else{
System.out.println("Already File Exits..");
}
}
catch(IOException e){
System.out.println("Virus Corrupted!");
}
}

// @ Contact Details
public static void Contact_Details(){
try{
System.out.println("\t\t>>> Contact Details ~ 2023 <<<\n\n");
Scanner str = new Scanner(System.in);
System.out.print("Enter the Contact Name: ");
String Name1 = str.nextLine();
File file1 = new File(Name1+".txt");
Scanner re = new Scanner(file1);
while(re.hasNextLine()){
String data = re.nextLine();
System.out.println(data);
}
re.close();
}
catch(FileNotFoundException e){
System.out.println("Sorry File Name Not Found!");
}
}

// @ Edit Contacts
public static void Edit_Contact(){
try{
System.out.println("\t\t>>> Edit Contact ~ 2023 <<<\n\n");
Scanner str = new Scanner(System.in);
Scanner log = new Scanner(System.in);
Scanner in = new Scanner(System.in);
System.out.print("Enter the Contact Name: ");
String Name2 = str.nextLine();
File file2 = new File(Name2+".txt");
if(file2.delete()){
System.out.print("Enter the Name: ");
String name = str.nextLine();
System.out.print("Enter the Company: ");
String company = str.nextLine();
System.out.print("Enter the Title: ");
String title = str.nextLine();
System.out.print("Enter the Phone Number: ");
long phone_number = log.nextLong();
System.out.print("Enter the Email: ");
String email = str.nextLine();
System.out.print("Enter the Notes: ");
String notes = str.nextLine();
File file4 = new File(name+".txt");
if(file4.createNewFile()){
FileWriter writerr = new FileWriter(name+".txt");
writerr.write("Name: "+name+"\nCompany: "+company+"\nTitle: "+title+"\nPhone Number: "+phone_number+"\nEmail: "+email+"\nNotes: "+notes);
writerr.close();
}
else{
System.out.println("File Not Created Please the File...");
}
}
else{
System.out.println("File Not Found...");
}
}
catch(IOException e){
System.out.println("Sorry File Name Not Found!");
}
}

// @ Delete Contact
public static void Delete_Contact(){
System.out.println("\t\t>>> Delete Contact ~ 2023 <<<\n\n");
Scanner str = new Scanner(System.in);
System.out.print("Enter the Contact Name: ");
String Name3 = str.nextLine();
File file3 = new File(Name3+".txt");
if(file3.delete()){
System.out.println("Contact Deleted..");
}
else{
System.out.println("Somthing went wrong!");
}
}

// @ Exit...
public static void Exit(){
System.out.println("\t\t>>> Thanks ~ 2023 <<<\n\n");
System.out.println("Exit...");
}
}

// by Vinoth_associate_Trainer