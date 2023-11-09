package leetcode_exercises;

public class Main {
    public static void main(String[] args) {

        //FindMiddleNode
        FindMiddleNode myList = new FindMiddleNode(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);


        System.out.println("----------");
        myList.printAll();
        System.out.println("----------");
        System.out.println(myList.findMiddleNode().value);


        System.out.println("-------------");

        //HassLoop

        HasLoop myList2 = new HasLoop(3);
        myList2.append(2);
        myList2.append(0);
        myList2.append(-4);
        myList2.append(5);
        myList2.append(8);


        myList2.printAll();
        System.out.println(myList2.hasLoop());

        System.out.println("-------------------");

        //FindKthNodeFromEnd

        FindKthNodeFromEnd findMyList = new FindKthNodeFromEnd(3);
        findMyList.append(8);
        findMyList.append(5);
        findMyList.append(10);
        findMyList.append(2);
        findMyList.append(1);

       System.out.println(findMyList.findKthFromEnd(2).value);

        System.out.println("-------------------");
        //Partition List

        PartitionList parList = new PartitionList(3);
        parList.append(8);
        parList.append(5);
        parList.append(10);
        parList.append(2);
        parList.append(1);

        parList.partitionList(5);
        parList.printAll();

        //RemoveDublicates

        RemoveDuplicates removeDup = new RemoveDuplicates(1);
        removeDup.append(2);
        removeDup.append(3);
        removeDup.append(1);
        removeDup.append(4);
        removeDup.append(2);
        removeDup.append(5);

        removeDup.removeDuplicates();

        removeDup.printAll();

        //BinaryToDecimal

        System.out.println("-------------");
        BinaryToDecimal binary = new BinaryToDecimal(1);
        binary.append(0);
        binary.append(1);
        binary.append(0);
        binary.append(1);
        binary.append(0);

        System.out.println(binary.binaryToDecimal());

    }
}
