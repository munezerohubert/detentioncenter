package com.detention.detentioncenter.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.yaml.snakeyaml.events.Event.ID;
import com.detention.detentioncenter.user.signup;
import com.detention.detentioncenter.user.user;

import com.exam.demo.models.Course;
import com.example.demo.models.Student;
import com.example.demo.models.StudentFiles;
import com.example.demo.services.FileService;
import com.example.demo.services.StudentService;

import jakarta.servlet.http.HttpSession;
public class detentioncentercontroller {
}
