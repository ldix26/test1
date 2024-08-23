/************************************
 *File: Proj5.java
 *Name: Lauren Dixon
 *Date: 3 November 2015
 
 *Compile: javac Proj5.java
 *Usage: java Proj5
 *System: terminal
 *Description: Finds peaks and sorts them
 ************************************/

public class Proj5
{
  public static void main(String[] args)
    {
        float [] x =  {0.2f, 0.5f, 0.1f, 0.15f, 0.2f, 0.13f, 0.3f, 0.25f, 0.3f, 0.3f,
            0.7f, 0.2f, 0.45f, 0.15f, 0.2f, 0.85f, 0.3f, 0.65f, 0.2f, 0.1f};
        int [] peaks = new int [10];
        int pk = 0;
        
        for(int i=0; i < x.length; i++)
        {
            System.out.printf("%.4f ", x[i]);
            if(i==9)
            {
                System.out.println("");
            }
        }
        
        for(int i=1; i < x.length-1; i++)
        {
            if(x[i] > 2*x[i+1] && x[i] > 2*x[i-1])
            {
                peaks[pk]=i;
                pk++;
            }
        }
        
        System.out.println("\n\nThere are " + pk + " peaks");
        
        for(int i=0; i < x.length/2; i++)
        {
            if(peaks[i] > 0)
            {
                System.out.println(peaks[i] + " " + x[peaks[i]]);
            }
        }
        
        System.out.println("\nSorted Peaks");
        for (int i=0; i<pk; i++)
         {
         // find smallest element in elements i to x.length
             
         float currentMin = x[peaks[i]];
         int minIndex = i;
             
         for (int j=i+1; j < pk; j++)
           {
               
           if (x[peaks[j]] < currentMin)
             {
               currentMin = x[peaks[j]];
               minIndex = j;
             }
               
           if (minIndex != i)
              {
                 int temp = peaks[i];
                 peaks[i] = peaks[minIndex];
                 peaks[minIndex] = temp;
              }
           }
         }
         // swap smallest element with element i

        /*array names are wrong
         need to figure out what I need to compare (compare the values)
         also need to pay attention to what I need to swap
         */
        
        for(int i=0; i < x.length/2; i++)
        {
            if(peaks[i] > 0)
            {
                System.out.println(peaks[i] + " " + x[peaks[i]]);
            }
        }
    }
}