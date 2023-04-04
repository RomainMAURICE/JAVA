package fr.uge.manifest;

public class Main {
	  public static void main(String[] args) {
		    var container = new Container("Germany", 500);
		    System.out.println(container.destination());  // Germany
		    System.out.println(container.weight());  // 500
		    
		     var container2 = new Container("Italy", 400);
		     var container3 = new Container("Austria", 200);
		     var manifest = new Manifest();
		     manifest.add(container2);
		     manifest.add(container3);

		     var container4 = new Container("Spain", 250);
		     var container5 = new Container("Swiss", 200);
		     var manifest2 = new Manifest();
		     manifest2.add(container4);
		     manifest2.add(container5);
		     //System.out.println(manifest2);
		     // 1. Spain 250kg
		     
		     var passenger = new Passenger("Paris");
		     manifest2.add(passenger);
		     System.out.println(manifest2);
		     
		     var passenger1 = new Passenger("France");
		     var container6 = new Container("England", 350);
		     var container7 = new Container("Italy", 350);
		     var manifest3 = new Manifest();
		     manifest3.add(passenger1);
		     manifest3.add(container6);
		     manifest3.add(container7);
		     
		     manifest3.removeAllContainerFrom("France");
		     
		     System.out.println(manifest3);
		     
		     System.out.println(manifest3.weight());

	  }
}
