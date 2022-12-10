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
class ParcInfoApplicationTests {

	  @Autowired
	    private AppRolesService appRolesService;

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

	    @Test
	    void createAppRoles() {

	        AppRolesDTO appRoles = new AppRolesDTO();
	        appRoles.setNom("ROLE_USER");

	        AppRolesDTO appRolesSave = appRolesService.createAppRole(appRoles);

	        Assertions.assertNotNull(appRolesSave);
	        //Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
	    }

	    @Test
	    void deleteAppRoles() {

	        appRolesService.deleteAppRoles(1);
	        Assertions.assertTrue(true);
	    }

	    @Test
	    void operation() {
	        int val1 = 1;
	        int val2 = 2;
	        int val3 = val1 + val2;
	        Assertions.assertEquals(3, val3);
	    }

}
