import java.util.*;

class Point
{
    int x;
    int y;
    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class Main
{
  public static boolean NumOfWay(int x,int y, ArrayList<Point> path, HashMap<Point,Boolean> map)
  {
      Point p = new Point(x,y);
      
      if(map.containsKey(p))
          map.get(p);
      
      if(x== 0 && y== 0)
          return true;
      
      boolean isSuccess = false;
      if(x > 0 && isFree(x-1,y))
          isSuccess = NumOfWay(x-1,y,path,map);
      
      if(y > 0 && isFree(x,y-1))
          isSuccess = NumOfWay(x,y-1,path,map);
      
      if(isSuccess)
          path.add(p);
      
      map.put(p,isSuccess);
      
      return isSuccess;
         
  }
    
  public static boolean isFree(int x,int y )
  {
      return true;
  }
}