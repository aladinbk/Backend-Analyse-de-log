package org.exemple.web;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.exemple.entities.record;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Logweb {
    
	@RequestMapping(value="/file",method=RequestMethod.GET) 
	public List<record> getFile(@PathParam("path") String path, //recuperation du path au niveau de l'url
			@PathParam("split") String split,                   //recuperation du split au niveau du url 
			@PathParam("framework") String framework) throws IOException {	//recuperation du niveau de test	
		 BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		 String  ligne="";
		 
		 ArrayList<record> lista = new  ArrayList<record>();
		 
		 while ( (ligne = bufferedReader.readLine() ) != null)
		    {	
			 String line=ligne; 
			float s=0;
			 
			  String[] stringsArr = line.split("\\"+split);

			  for(int i=0;i<stringsArr.length;i++) {
				//  int c,count=0;
		    	  if(stringsArr[1].contains(framework)) {
			    	  record re= new record();  
			    	  
			    	  re.setDate(stringsArr[0]);
			   // 	  c=count+i;
			    	  re.setFramework(stringsArr[1]);
			          re.setAdresseIP(stringsArr[2]);
			    	  re.setAdresseMAC(stringsArr[3]);
			    	  re.setDescription(stringsArr[4]);
			    	  lista.add(re);
		    	     }
		    	 
                             		 
		    	      
		          }	  
			          //System.out.println(count);
              			  
           
	}
		return lista;	      
	
	}

	@RequestMapping(value="/fileDetails",method=RequestMethod.GET) 
	public List<record> getFileDetails(@PathParam("path") String path,
			@PathParam("split") String split,
			@PathParam("framework") String framework) throws IOException {	
		
		 BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		 String  ligne="";
		 
		 ArrayList<record> lista2 = new  ArrayList<record>();
		 
		 while ( (ligne = bufferedReader.readLine() ) != null)
		    {	
			   String line=ligne; 
			
			   String[] stringsArr = line.split("\\"+split);
		       
			   for(int i=0;i<stringsArr.length;i++) {
           	   record r1=new record();

               if(stringsArr[1].contains(framework)) {
            	   r1.setFramework(stringsArr[1]);
            	   r1.setAdresseIP(stringsArr[2]);
            	   r1.setDescription(stringsArr[4]);
            	   
            	   lista2.add(r1);   
               }
           

                
			  }
              			  
           
	}
		return lista2;	      
	
	}

}
