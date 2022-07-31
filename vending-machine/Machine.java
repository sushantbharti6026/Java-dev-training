public class Machine {
    // As 9 items are in 3 row, we need 3 by 3 matrix;
    private Item[][] items;

    //1. Constructor
    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
         for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
         }
    }

    //2. Getter
    public Item getItems(int row, int spot){
        return new Item(this.items[row][spot]);
    }

    // 3. Setter
    public void setItems(Item item, int row, int spot){
        this.items[row][spot]= new Item(item);
    }
    //4. toString()

    public String toString(){
        String temp = "";
        for (int i = 0; i < items.length; i++) { 
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += this.items[i][j].toString()+" " ;
            }
            temp += "\n\n";
        }

        return temp;

    }


    
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

     // 5. Actions

     public boolean dispense(int row, int spot){
        if(this.items[row][spot].getQuantity()>0){
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity()-1);
            return true;
        }
        return false;
     }

}
