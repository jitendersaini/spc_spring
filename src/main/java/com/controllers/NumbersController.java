package com.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.models.Numbers;
import com.models.NumbersDao;


/**
 * @author j.saini
 *
 */
@Controller
public class NumbersController {

	// ------------------------
	// PUBLIC METHODS
	// ------------------------
	@Autowired
	private NumbersDao numbersDao;

	@RequestMapping("/addNewNumber")	
	public String add(Long number) {
		try {
			numbersDao.save(new Numbers(number));			
		} catch (Exception ex) {
			
		}
		return "redirect:findAllNumbers";
	}

	

	@RequestMapping("/findAllNumbers")
	@ResponseBody
	public String findAllNumbers() {
		StringBuilder stb = new StringBuilder();
		StringBuilder stb1 = new StringBuilder();
		StringBuilder stb2 = new StringBuilder();
		try {

			List<Numbers> numbers = numbersDao.findAll();
			List<Long> orgList = new ArrayList<Long>();
			List<Long> list = new ArrayList<Long>();
			for (Numbers numbers2 : numbers) {
				stb.append(numbers2.getOriginalStack() + " | ");
				orgList.add(numbers2.getOriginalStack());
				list.add(numbers2.getOriginalStack());				
			}
			Collections.sort(list);
			int index = 0;
			for (Long long1 : list) {
				int ii = orgList.indexOf(long1);
				int changeIndex = (ii-index);
				if(changeIndex<0) {
					stb2.append("<br>Element "+ long1+" is shifted down by position "+Math.abs(changeIndex));
				} else if(changeIndex>0) {
					stb2.append("<br>Element "+ long1+" is shifted up by position "+Math.abs(changeIndex));
				} else {
					stb2.append("<br>Element "+ long1+" is unchanged in the stack");
				}
				stb1.append(long1+ " | ");
				index++;
			}
			
		} catch (Exception ex) {
			return "";
		}
		return "Original Stack Of Numbers are: " + stb.toString()+"<br> Sorted Stack of Numbers are: "+stb1.toString()+"<br><br><br>"+stb2.toString();
	}

	

}
