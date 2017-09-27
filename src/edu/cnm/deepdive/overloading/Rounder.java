package edu.cnm.deepdive.overloading;

/**
 * @author Abdul Haseeb Gauba
 *
 */
public class Rounder {
  
  public static long round(double a) {
    
    return Math.round(a);
    
  }
  public static int round(float a) {
    
    return Math.round(a);
    
  }
  public static double round(double a, double multiple ) {
    double result = a + Math.abs(multiple)/2.0;
    result-=  result % multiple;
    return result;
    
  }
  public static float round(float a, float multiple) {
    float result = a + Math.abs(multiple)/2.0f;
    result-=  result% multiple;
    return result;
 }
  public static int round(int a, int multiple) {
    int result = a + Math.abs(multiple)/2;
    result-=  result % multiple;
    return result;
      }
  public static long round(long a, long multiple) {
    long result = a + Math.abs(multiple)/2;
    result-=  result % multiple;
    return result;
      }

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(round(Math.PI));
    System.out.println(round((float)Math.PI,0.0001f));
    System.out.println(round(95, 7d));
  }

}
