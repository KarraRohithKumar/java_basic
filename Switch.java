public class Switch {
    public static void main(String[] args) {
    

        /*int n=4;
        switch(n){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tues");
            break;
            case 3:
            System.out.println("wedns");
            break;

        }  
      }
}*/
/*String day="hgh";
switch(day){
    case "mon","son" -> System.out.println("6am");
    case "tue"->System.out.println("7am");
    default->System.out.println("3am");
}*/
String day="mon";
String open=" ";

open=switch(day){
    case "mon","son" : yield "6am" ;
    case "tue" : yield "7am" ;
    default: yield "3am" ;
};

    System.out.println(open);


    }
}
