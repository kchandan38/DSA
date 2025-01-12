package com.datastructure.java8course.ch3;

public class Item implements Foldable, Washable {

    String name;
    public Item(String name){
        this.name = name;
        }
    public void fold(){
        System.out.println("Folding " + name);
    }
    @Override
    public void wash() {
        System.out.println("Washing " + name);
    }

    public static void main(String[] args) {
        //Foldable.printFoldInstructions();
        Item item = new Item("Jeans");
        item.fold();
    }
}
