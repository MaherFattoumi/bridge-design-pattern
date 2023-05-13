Feature: Drawing Shapes

Scenario: Drawing a Circle with Red Color
  Given a Red color
  And a Circle shape
  When I draw the Circle
  Then it should be drawn with Red color

Scenario: Drawing a Square with Blue Color
  Given a Blue color
  And a Square shape
  When I draw the Square
  Then it should be drawn with Blue color