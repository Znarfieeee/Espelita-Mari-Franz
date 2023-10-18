/*
Espelita, Mari Franz H.
BSIT 2B
Route Activity
*/

import java.util.Scanner;

public class RouteActivity {
   public static void main(String[] args) {
      Route route = new Route();
      Eta eta = new Eta();
      Scanner scanner = new Scanner(System.in);
      int speed;
      
      System.out.println("Welcome, I'll guide you to the best way to Moalboal...");
      route.defRoute();
      System.out.print("Is Barili (Route 4) blocked?[Y/N]: ");
      char ans = scanner.next().charAt(0);
      ans = Character.toLowerCase(ans);

      if (ans == 'y') {
         System.out.print("Is Dumanjug (Route 4.2.1) blocked?[Y/N]: ");
         char ans2 = scanner.next().charAt(0);
         ans2 = Character.toLowerCase(ans2);
         if (ans2 == 'y') {
            route.route3();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            double distance = 92.3;
            double estimatedHours = eta.est_time_arr(distance, speed);
            int hours = (int) estimatedHours;
            int minutes = (int) ((estimatedHours - hours) * 60);
            System.out.println("Distance: " + distance + "km");
            System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minutes");
         } else {
            route.route2();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            double distance = 94.0;
            double estimatedHours = eta.est_time_arr(distance, speed);
            int hours = (int) estimatedHours;
            int minutes = (int) ((estimatedHours - hours) * 60);
            System.out.println("Distance: " + distance + "km");
            System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
            }
      } else {
         route.route4();
         System.out.print("Speed: ");
         speed = scanner.nextInt();
         double distance = 84.9;
         double estimatedHours = eta.est_time_arr(distance, speed);
         int hours = (int) estimatedHours;
         int minutes = (int) ((estimatedHours - hours) * 60);
         System.out.println("Distance: " + distance + "km");
         System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
      }
      
      scanner.close();
   }

   static class Route {
      public void defRoute() {
         System.out.println("\nDefault Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Barili       --- Route 4");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");
      }

      public void route2() {
         System.out.println("\nRecommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Sibonga      --- Route 4.2");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");
      }

      public void route3() {
         System.out.println("\nRecommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Argao        --- Route 5");
         System.out.println("Ronda        --- Route 5.1");
         System.out.println("Alcantara    --- Route 5.2");
         System.out.println("Moalboal     --- Arrived");
      }
      public void route4() {
         System.out.println("\nRecommended Route: ");
         System.out.println("Cebu City    --- START");
         System.out.println("Minglanilla  --- Route 1");
         System.out.println("San Fernando --- Route 2");
         System.out.println("Carcar City  --- Route 3");
         System.out.println("Barili       --- Route 4");
         System.out.println("Dumanjug     --- Route 4.2.1");
         System.out.println("Alcantara    --- Route 4.2.2");
         System.out.println("Moalboal     --- Arrived");
      }
   }
   static class Eta{
         public solution(int hours, int minutes){
         double estimatedHours = eta.est_time_arr(distance, speed);
         int hours = (int) estimatedHours;
         int minutes = (int) ((estimatedHours - hours) * 60);
         System.out.println("Distance: " + distance + "km");
         System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
         }
         public double est_time_arr(double distance, int speed) {
         double time = distance / speed;
         return time;
      }
   }
}
