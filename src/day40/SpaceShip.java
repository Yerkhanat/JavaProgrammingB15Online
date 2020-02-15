package day40;

public class SpaceShip {

    String name;
    int xCoordinate;
    int yCoordinate;
    String currentDirection; // up, down, right, left
   public void setInitialPosition(int x, int y){

       xCoordinate=x;
       yCoordinate=y;

   } public void setDirection(String direction){

       currentDirection =direction;
    }

    public void move1Block(){
      if(currentDirection.equals("up")){
          yCoordinate+=1;
      }else if(currentDirection.equals("down")){
          yCoordinate-=1;
      }else if(currentDirection.equals("right")){
          xCoordinate+=1;
      }else if(currentDirection.equals("left")){
          xCoordinate-=1;
      }
        System.out.println("New coordinate is ( x = "+ xCoordinate+ " , y = "+yCoordinate+")");

    }

    public void move1Block(String newDirection){
       setDirection(newDirection);
       move1Block();
    }

    public String toString(){


       return "Spaceship name is <"+name+"> Current Location is (x="+xCoordinate+" , y="+
               yCoordinate+") and current direction is to the >>"+currentDirection ;
    }





}
