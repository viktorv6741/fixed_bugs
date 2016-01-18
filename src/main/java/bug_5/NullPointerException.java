package bug_5;

public class NullPointerException {
    public static void main(String[] args) {


        CustomList[] customLists = new CustomList[5];

        //initCustomList(customLists);

        customLists[0] = new CustomList();
        customLists[0].name = "newName";

    }

    /*private static CustomList[] initCustomList(CustomList[] customLists){
        for (int i = 0; i < customLists.length; i++){
            customLists[i] = new CustomList();
        }
        return customLists;
    }*/
}

class CustomList {
    public String name;
    public String value;

    public CustomList() {
    }
}

