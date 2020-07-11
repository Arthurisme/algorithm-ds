package com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter20;


import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.Circle;
import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.GeometricObject;
import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.Rectangle;

import java.util.Comparator;

public class TestComparator {
  public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);
    GeometricObject g2 = new Circle(5);

    GeometricObject g = 
      max(g1, g2, new GeometricObjectComparator());
    
    System.out.println("The area of the larger object is " + 
      g.getArea());
  }
  
  public static GeometricObject max(GeometricObject g1, 
      GeometricObject g2, Comparator<GeometricObject> c) {
    if (c.compare(g1, g2) > 0)
      return g1;
    else
      return g2;
  }
}