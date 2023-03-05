public enum DrinksMachine {
    coffee(1,"coffee"), tea(2,"tea"), lemonade(3,"lemonade"), mojito(4, "mojito"), water(5, "water"), coca_cola(6,"coca_cola");
private int value;
private String name;

private DrinksMachine (int value, String name){
    this.value= value;
    this.name = name;
}
int getValue(){
    return value;
}
String getName(){
    return  name;
}

}
