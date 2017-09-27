package gov.ca.cwds.geo.service;

import static org.junit.Assert.*;

import gov.ca.cwds.geo.persistence.dao.SmartyStreetsDAO;
import gov.ca.cwds.rest.api.Request;
import java.io.Serializable;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;

public class AddressServiceTest {

  private AddressService addressService = new AddressService(null);

  @Test(expected = NotImplementedException.class)
  public void find() throws Exception {
      Serializable primaryKey = 1L;
      addressService.find(primaryKey);
  }

  @Test(expected = NotImplementedException.class)
  public void delete() throws Exception {
    Serializable primaryKey = 1L;
    addressService.delete(primaryKey);
  }

  @Test(expected = NotImplementedException.class)
  public void update() throws Exception {
    Serializable primaryKey = 1L;
    addressService.update(primaryKey, null);
  }

}