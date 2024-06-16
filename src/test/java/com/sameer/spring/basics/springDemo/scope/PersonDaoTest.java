package com.sameer.spring.basics.springDemo.scope;

import com.sameer.spring.basics.springDemo.SpringDemoScopeApplication;
import com.sameer.spring.basics.springDemo.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load the Context
@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes= SpringDemoScopeApplication.class)
public class PersonDaoTest {

    @Mock
    JdbcConnection jdbcConnection;


    @InjectMocks
    PersonDAO personDAO;

    @Test
    public void binarySearchImpBasicSenario(){
        Mockito.when(jdbcConnection.fetchAll()).thenReturn(new int[] {1,2,3,4});
        int actualResult = personDAO.getgreatestOfAll();
        Assert.assertEquals(4,actualResult);
    }
}
