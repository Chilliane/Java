public class MyClass {
    
    //list of airports 
    static String [] AP ={"CEBU","MANILA","ILOILO","PAMPANGA","PALAWAN","BOROCAY","DAVAO","ILOCOS","ZAMBOANGA","SIARGAO"};
    static String [][] routes ={
        {"CEBU","MANILA"},
        {"CEBU","PALAWAN"},
        {"CEBU","DAVAO"},
        {"CEBU","ILOILO"},
        {"MANILA","PAMPANGA"},
        {"MANILA","DAVAO"},
        {"MANILA","CEBU"},
        {"ILOILO","BORACAY"},
        {"BORACAY","PALAWAN"},
        {"ZAMBOANGA","PALAWAN"}
        
        
    };
    
    //function would show the list of Airports 
    static void showAirports(){
        for(int x = 0; x<AP.length;x++)
         System.out.println(AP[x]);
    }
    
    //function that would show the list of flight routes
    static void showRoutes()
    {
      for(int x =0; x<routes.length;x++)
      {
          for(int y=0;y<routes[x].length;y++)
          {
              System.out.print("Flight#"+x+" "+routes[x][y]+" ");
          }
          System.out.println();
      }
    }
    
    //function that will show the routes needed to get to destination
    //if airport==route[x][y] then find if route [x][y] == destination 
    static void getroute(String airport, String destination){
    int nroute =0;
    boolean ap = false;
    boolean dt = false;
      for(int x =0; x<routes.length;x++)
      {
         for(int y=0;y<routes[x].length;y++)
            {
              nroute = x+1;
              
              if(airport.equals(routes[x][y]))
              {
                  ap = true;
              }
              if( ap == true && destination.equals(routes[x][y]))
              {
                  dt = true;
                  break;
              }
              if( dt == true)
              {
                  
              }
            }
            if(ap==true && dt == true)
            {
                break;
                
            }
         
      }
      System.out.println("Flight #"+ nroute);
        
          
    }
    //Function to find connectingflights
    static void findflights(String destination)
    {
        String nroute[][] = new String[10][2];
        String nroute2[][];
        boolean d = false;
        int p = 0;
    
     for(int x=0;x<routes.length;x++)
       {
         for(int y=0;y<routes[x].length;y++)
         {
             p = y;
        
         }
         if(routes[x][p].equals(destination))
         {
             nroute[x][p]=routes[x][p];
             nroute[x][p-1]=routes[x][p-1];
         }
       }
    //display list of routes for palawan
     for (int z = 0; z<nroute.length;z++)
     {
         for(int q=0;q<nroute[z].length;q++)
         {
             {
             if(nroute[z][q]!=null)
             System.out.print(nroute[z][q]+"\n");
             }
             
         }
         
    }
     

  
    
    
    public static void main(String args[]) {
    
    findflights("PALAWAN");
    //getroute("CEBU","DAVAO");
     // getroute();
    //showAirports();
    //showRoutes();
    }
    
    
   
}
 