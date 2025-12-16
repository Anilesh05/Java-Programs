class Car
          { 
            void run()
            {
            System.out.println("Car is running");
            }  
          }  
          
          class Bike extends Car
          { 
            void run()
            {
            System.out.println("Bike is running safely");
            }  
            
            public static void main(String[] args)
            {  
             Car obj = new Car();//creating object  
             obj.run();//calling method  

             Car obj1 = new Bike();
             obj1.run();
            
             Bike obj2=new Bike();
             obj2.run();

             //Bike obj3=new Car();
             //obj3.run();
             }  
          }  
