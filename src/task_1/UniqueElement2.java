package task_1;

import java.util.ArrayList;

public class UniqueElement2 {

    public static void main(String[] args) {
        UniqueElement2 element = new UniqueElement2();
        ArrayList<Integer> arrayListRepository = element.initializationArrayListRepository();
        ArrayList<Integer> inputList = element.initializationInputList();
        System.out.println(element.getUniqElements(arrayListRepository, inputList));
    }

    public ArrayList<Integer> getUniqElements(ArrayList<Integer> arrayListRepository,
                                              ArrayList<Integer> inputList) {
        for (int i : inputList) {
            if (!arrayListRepository.contains(i)) {
                arrayListRepository.add(i);
            } else {
                return new ArrayList<>();
            }
        }
        return arrayListRepository;
    }

    public ArrayList<Integer> initializationArrayListRepository() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            result.add(i);
        }
        return result;
    }

    public ArrayList<Integer> initializationInputList() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(5);
        result.add(15);
        result.add(16);
        result.add(17);
        result.add(18);
        return result;
    }
}
