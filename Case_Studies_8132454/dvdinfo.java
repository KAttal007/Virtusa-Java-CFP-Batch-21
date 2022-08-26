TestApplication.java

package com.main;
import com.utility.*;
public class TestApplication {

public static void main(String[] args) {
DVDInfoUtility obj=new DVDInfoUtility();
obj.menu();

}

}


DVDInfo.java

package com.model;

public class DVDInfo implements Comparable<DVDInfo>{
String title;
String genre;
String leadActor;

public DVDInfo(String title,String genre,String leadActor) {
this.title=title;
this.genre=genre;
this.leadActor=leadActor;
}

public String getTitle() {
return title;
}

public String getGenre() {
return genre;
}

public String getLeadActor() {
return leadActor;
}
public int compareTo(DVDInfo d) {
return title.compareTo(d.getTitle());
}

}


FileService.java

package com.service;

public interface FileService {
public void readData();
public void addData();
public void deleteData();
public void writeData();
public void sortData();
public void displayData();
}

FileServiceImpl.java

package com.service;
import com.model.*;
import java.util.*;
import java.io.*;
public class FileServiceImpl implements FileService {
private List<DVDInfo> dvdinfo=new ArrayList<DVDInfo>();
@Override
public void readData() {
try {
FileReader fr = new FileReader("dvdinfo.txt");
BufferedReader br=new BufferedReader(fr);
String str1;
while((str1=br.readLine())!=null) {
String str[]=str1.split(",");
DVDInfo d=new DVDInfo(str[0],str[1],str[2]);
dvdinfo.add(d);
}
}
catch (IOException e) {

e.printStackTrace();
}
}

@Override
public void addData() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter title:");
String t=sc.next();
System.out.println("Enter genre:");
String g=sc.next();
System.out.println("Enter lead actor:");
String l=sc.next();
DVDInfo d=new DVDInfo(t,g,l);
dvdinfo.add(d);
System.out.println("added successfully.");
writeData();
}

@Override
public void deleteData() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter which object to be deleted:");
int r=sc.nextInt();
r=r-1;
dvdinfo.remove(r);
System.out.println("removed successfully.");
writeData();

}

@Override
public void writeData() {
try {
FileOutputStream fw = new FileOutputStream("dvdinfo.txt");
PrintStream ps=new PrintStream(fw);
for(DVDInfo dv:dvdinfo) {
String ti=dv.getTitle();
String ge=dv.getGenre();
String la=dv.getLeadActor();
ps.println(ti+","+ge+","+la);
}
}
catch (IOException e) {
e.printStackTrace();
}

}

@Override
public void sortData() {

Collections.sort(dvdinfo);
System.out.println("Sorted successfully.");
writeData();
}

@Override
public void displayData() {
try {
FileReader fr = new FileReader("dvdinfo.txt");
BufferedReader br=new BufferedReader(fr);
String str1;
while((str1=br.readLine())!=null) {
System.out.println(str1);
}
}
catch (IOException e) {

e.printStackTrace();
}

}

}


DvdInfoUtility.java

package com.utility;

import java.util.Scanner;
import com.service.*;
public class DVDInfoUtility {
public void menu() {
Scanner sc=new Scanner(System.in);
FileServiceImpl fsi=new FileServiceImpl();
while(true) {
System.out.println("Enter your choice:");
System.out.println("1.readData");
System.out.println("2.addData");
System.out.println("3.deleteData");
System.out.println("4.writeData");
System.out.println("5.sortData");
System.out.println("6.displayData");
System.out.println("7.exit");
int ch=sc.nextInt();
switch(ch) {
case 1:fsi.readData();
  break;
case 2:fsi.addData();
      break;
case 3:fsi.deleteData();
      break;
case 4:fsi.writeData();
      break;
case 5:fsi.sortData();
      break;
case 6:fsi.displayData();
    break;
case 7:System.out.println("You are exited.");
  System.exit(1);
  break;
 
}
}
}
}