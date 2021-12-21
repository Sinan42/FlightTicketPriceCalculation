import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int distance,age,type,price;

        System.out.print("Enter the distance in km:");
        distance=input.nextInt();


        if(distance>0){
            System.out.print("Enter your age:");
            age=input.nextInt();
            if(age>0){
                System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip):");
                type=input.nextInt();
                if(type==1||type==2){

                    if(age<12) {
                        if(type==1){
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.5);
                            System.out.println("Total price:"+price);
                        }else{
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.5);
                            price=(int) (price - (price * 0.2));
                            price *= 2;
                            System.out.println("Total price:"+price);

                        }
                    }else if(age>=12&&age<=24){
                        if(type==1){
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.1);
                            System.out.println("Total price:"+price);

                        }else {
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.1);
                            price=(int) (price - (price * 0.2));
                            price *= 2;

                            System.out.println("Total price:"+price);
                        }
                    }else if(age>65){
                        if(type==1){
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.3);
                            System.out.println("Total price:"+price);

                        }else {
                            price = (int) ((distance * 0.10)-(distance*0.10)*0.3);
                            price=(int) (price - (price * 0.2));
                            price *= 2;

                            System.out.println("Total price:"+price);
                        }

                    }else{
                        if(type==1){
                            price = (int) ((distance * 0.10));
                            System.out.println("Total price:"+price);

                        }else {
                            price = (int) ((distance * 0.10));
                            price=(int) (price - (price * 0.2));
                            price *= 2;

                            System.out.println("Total price:"+price);
                        }

                    }

                }else {
                    System.out.println("wrong type");
                }

            }else {
                System.out.println("wrong age");
            }
        }else {
            System.out.println("wrong");
        }



    }
}
