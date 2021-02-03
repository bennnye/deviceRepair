package deviserepair;

import java.util.ArrayList;
import java.util.Scanner;

public class laptop extends device{
    
    Scanner scan = new Scanner(System.in);
    ArrayList<component>components = new ArrayList<>();

    public laptop(String identificationCode, String makeAndModel, String Owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, Owner, problemDescription, repairNotes, priority);
    }
    
    public ArrayList<component> getComponents(){
        return components;
    }
    
    public void addComponent(component component){
        components.add(component);
    }
    
    public void deleteComponent(int index){
        if (index>=0 && index < components.size()){
            components.remove(index);
        }
    }
}
