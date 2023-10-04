//This is a happy comment since I am fully satisfied with the code
package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;  //This is an ambivalent edit

public class GT4500Test {

  private GT4500 ship;

  @BeforeEach
  public void init(){
    this.ship = new GT4500();
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
