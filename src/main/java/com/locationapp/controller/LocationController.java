package com.locationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationapp.dto.LocationData;
import com.locationapp.entities.Location;
import com.locationapp.services.LocationService;


@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "showPage";
	}
	
	//@RequestMapping("/savePage")
	public String savePage(@RequestParam("id") long id,@RequestParam("code") String code,@RequestParam("name") String name,@RequestParam("type") String type ) {
		System.out.println(id);
		System.out.println(code);
		System.out.println(name);
		System.out.println(type);
		return "showPage";
	}
	
	/*@ModelAttribute- it binds/maps the 
	form data to entity class object.*/
	@RequestMapping("/savePage")
	public String savePage(@ModelAttribute Location location, ModelMap modelMap) {
		System.out.println(location.getId());//To check data in console
		System.out.println(location.getName());
		System.out.println(location.getCode());
		System.out.println(location.getType());
		locationService.save(location);
		modelMap.addAttribute("msg", "Data Saved");
		return "showPage";
	}
	//@RequestMapping("/savePage")
	public String savePage(LocationData locationData, ModelMap modelMap) {
		System.out.println(locationData.getId());
		System.out.println(locationData.getCode());
		System.out.println(locationData.getName());
		System.out.println(locationData.getType());
		modelMap.addAttribute("msg", "Data Saved");
		return "showPage";
	}
	
	@RequestMapping("/viewPage")
	public String viewPage(ModelMap modelMap) {
		List<Location> location = locationService.findAll();
		
		modelMap.addAttribute("locations", location);
		return "viewPage";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("Id") Long Id, ModelMap modelMap) {
		
		locationService.delete(Id);
		List<Location> location = locationService.findAll();
		
		modelMap.addAttribute("locations", location);
		return "viewPage";
		
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") Long id, ModelMap modelMap) {
		
		Location location = locationService.update(id);
		modelMap.addAttribute("locations", location);
		return "update";
	}
	
	@RequestMapping("/saveUpdate")
	public String saveUpdate(@ModelAttribute Location location, ModelMap modelMap) {
		
		locationService.save(location);
		
		modelMap.addAttribute("msg", "Data Updated");
		return "update";
		
	}
}