package task_1;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElement1 {

    public static void main(String[] args) {
        UniqueElement1 uniqueElement = new UniqueElement1();
        HashSet<Integer> hashSetRepository = uniqueElement.initializationHashSet();
        ArrayList<Integer> inputList = uniqueElement.initializationArrayList();
        System.out.println(uniqueElement.getUniqElements(hashSetRepository, inputList));
    }

    public HashSet<Integer> getUniqElements(HashSet<Integer> hashSetRepository, ArrayList<Integer> inputList) {
        int sizeHashSetRepository = hashSetRepository.size();
        int sizeInputList = inputList.size();
        hashSetRepository.addAll(inputList);
        if (sizeHashSetRepository + sizeInputList == hashSetRepository.size()) {
            return hashSetRepository;
        } else {
            return new HashSet<>();
        }

    }

    public HashSet<Integer> initializationHashSet() {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            result.add(i);
        }
        return result;
    }

    public ArrayList<Integer> initializationArrayList() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(5);
        result.add(15);
        result.add(16);
        result.add(17);
        result.add(18);
        return result;
    }
}
