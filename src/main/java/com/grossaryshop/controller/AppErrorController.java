package com.grossaryshop.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grossaryshop.model.User;
import com.grossaryshop.service.UserServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

public class AppErrorController  {

	  String error(HttpServletRequest request) {
	    return "<h1>Error occurred</h1>";
	  }

	  public String getErrorPath() {
	    return "/error";
	  }
}
