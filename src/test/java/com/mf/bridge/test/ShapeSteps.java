package com.mf.bridge.test;

import static org.junit.Assert.assertEquals;

import com.mf.bridge.BlueColor;
import com.mf.bridge.Circle;
import com.mf.bridge.Color;
import com.mf.bridge.RedColor;
import com.mf.bridge.Shape;
import com.mf.bridge.Square;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShapeSteps {
	private Shape shape;
	private Color color;

	@Given("a (.*) color")
	public void givenAColor(String color) {
		if (color.equalsIgnoreCase("red")) {
			this.color = new RedColor();
		} else if (color.equalsIgnoreCase("blue")) {
			this.color = new BlueColor();
		}
	}

	@Given("a (.*) shape")
	public void givenAShape(String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			this.shape = new Circle(color);
		} else if (shape.equalsIgnoreCase("square")) {
			this.shape = new Square(color);
		}
	}

	@When("I draw the (.*)")
	public void whenIDraw(String shape) {
		this.shape.draw();
	}

	@Then("it should be drawn with (.*) color")
    public void thenItShouldBeDrawnWithColor(String color) {
        String expected = "Drawing a " + shape.getClass().getSimpleName() + " with " + color + " Color ";
	}
	  
}