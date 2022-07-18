public class FindDuplicateElement {
    public static void findDuplicateElementInArray(int[] arrayOfNumbers) {
        for (int indexA=0; indexA<arrayOfNumbers.length; indexA++) {
            for (int indexB=indexA+1; indexB<arrayOfNumbers.length; indexB++) {
                if (arrayOfNumbers[indexA] == arrayOfNumbers[indexB]) {
                    System.out.println("Duplicate element in array : " + arrayOfNumbers[indexB]);
                }
            }
        }
    }
}
