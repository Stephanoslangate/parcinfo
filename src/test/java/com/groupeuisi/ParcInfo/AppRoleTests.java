package com.groupeuisi.ParcInfo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.groupeuisi.ParcInfo.Domaine.AppRolesDTO;
import com.groupeuisi.ParcInfo.service.AppRolesService;

import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppRoleTests {
	  @Autowired
	    private AppRolesService appRolesService;

    @Test
    void createAppRoles() {

        AppRolesDTO appRoles = new AppRolesDTO();
        appRoles.setNom("ROLE_USER");

        AppRolesDTO appRolesSave = appRolesService.createAppRole(appRoles);

        Assertions.assertNotNull(appRolesSave);
        //Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
    }
    @Test
    void getAppRoles() {
        List<AppRolesDTO> appRolesList =
                appRolesService.getAppRoles();

        Assertions.assertEquals(1, appRolesList.size());
    }
    
    @Test
    void getAppRole() {
        AppRolesDTO appRoles = appRolesService.getAppRoles(1);
        Assertions.assertNotNull(appRoles);
    }
}
