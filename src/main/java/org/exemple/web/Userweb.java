package org.exemple.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.exemple.dao.GRRepository;
import org.exemple.dao.UserRepository;
import org.exemple.entities.Groupe;
import org.exemple.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import net.minidev.json.JSONObject;
@RestController
@CrossOrigin("*")
public class Userweb {
	@Autowired	
private UserRepository userRepository;

	@Autowired
private GRRepository grRepository;
	
/*@RequestMapping(value="/users",method=RequestMethod.GET) 

public ArrayList<JSONObject>getUsers(){
	ArrayList  <JSONObject> json=new ArrayList<JSONObject>();
	List<User> all=userRepository.findAll();
	for(int i=0;i<userRepository.findAll().size();i++) {
		JSONObject j=new JSONObject();
		j.put("id_User",all.get(i).getId_User());
		j.put("firstname",all.get(i).getFirstname());
		j.put("lastname",all.get(i).getLastname());
		j.put("mail",all.get(i).getMail());
		j.put("password",all.get(i).getPassword());
		j.put("groupes",all.get(i).getGroupes() );
		//j.put("groupes",all.get(i).getGroupes());
		json.add(j);
	}
	return json;
	
}*/
@RequestMapping(value="/user",method=RequestMethod.POST) 
public User save(@RequestBody User c){
	 return userRepository.save(c);
}

@RequestMapping(value="/user/{id}",method=RequestMethod.PUT) 
public User save(@PathVariable Long id,  @RequestBody User c){
    c.setId(id);
	return userRepository.save(c);
}

@RequestMapping(value="/users",method=RequestMethod.GET) 
public List<User>getU(){
	 List<User> users=userRepository.findAll();
	 return users;
}

@RequestMapping(value="/groups",method=RequestMethod.GET) 
public List<Groupe> getg(){
	 List<Groupe> gr=grRepository.findAll();
	 return gr;
}


}
