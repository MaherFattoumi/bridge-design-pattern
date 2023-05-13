package com.mf.bridge.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mf.bridge.BlueColor;
import com.mf.bridge.Circle;
import com.mf.bridge.RedColor;
import com.mf.bridge.Shape;
import com.mf.bridge.Square;

public class BridgeTest {
	@Test
	public void testDrawCircleWithRedColor() {
	    Shape circle = new Circle(new RedColor());
	    String expected = "Drawing a Circle with Red color";
	    assertEquals(expected, circle.draw());
	}
	
	@Test
	public void testDrawSquareWithBlueColor() {
	    Shape square = new Square(new BlueColor());
	    String expected = "Drawing a Square with Blue color";
	    assertEquals(expected, square.draw());
	}
	
}

