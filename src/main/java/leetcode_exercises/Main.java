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

        FindKthNodeFromEnd findMyList = new FindKthNodeFromEnd(1);
        findMyList.append(2);
        findMyList.append(3);
        findMyList.append(4);
        findMyList.append(5);

        System.out.println(findMyList.findKthFromEnd(2).value);

    }
}
