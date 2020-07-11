package com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter21;


import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.Circle;
import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.GeometricObject;
import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter13.Rectangle;
import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter20.GeometricObjectComparator;

import java.util.*;

public class TestTreeSetWithComparator {
  public static void main(String[] args) {
    // Create a tree set for geometric objects using a comparator
    Set<GeometricObject> set =
      new TreeSet<>(new GeometricObjectComparator());
    set.add(new Rectangle(4, 5));
    set.add(new Circle(40));
    set.add(new Circle(40));
    set.add(new Rectangle(4, 1));

    // Display geometric objects in the tree set
    System.out.println("A sorted set of geometric objects");
    for (GeometricObject element: set)
      System.out.println("area = " + element.getArea());
  }
}
