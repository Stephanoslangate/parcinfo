package com.groupeuisi.ParcInfo.controller;

import com.groupeuisi.ParcInfo.Domaine.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testprop")
public class TestFilePropertie {
  @Value("${app.name}")
  private String appName;

  @GetMapping("/get")
  public String getAppRoles() {

      return appName;
  }
}

