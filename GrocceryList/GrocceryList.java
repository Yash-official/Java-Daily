import java.util.ArrayList;

public class GrocceryList {
    private ArrayList<String> grocceryList=new ArrayList<>();

    public void addGrocerItem(String item){
        grocceryList.add(item);
    }
    public void removeGroceryItem(int item){
        String actualItem=grocceryList.get(item);
        grocceryList.remove(actualItem);
    }
    public void modifyGroceryList(String item,String newItem){
        int num=grocceryList.indexOf(item);
        grocceryList.set(num, newItem);
        System.out.println("The Grocery item "+item+" have been modified to "+newItem);
    }
    public void printGroceryList(){
        System.out.println("You have "+grocceryList.size()+" items in the list");
        for(int i=0;i<grocceryList.size();i++){
            System.out.println(i+1+") "+grocceryList.get(i));
        }
    }
    public String findItem(String item){
        if(item!=null){
            int position=grocceryList.indexOf(item);
         if(position>=0){
        return grocceryList.get(position);
          }
         }
        return null;
    }


}
