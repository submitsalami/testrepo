
/**
 * This program shows how to access the elements of an array.
 *
 * @author T.Salami
 * @version 8.2 Accessing elements from Think Java 5th Edition
 */
public class AccessingElements
{
    
    public static void main(String[] args){
    //When an array of ints is created, it is initialized to zero
    //refer to the diagram
    
    /*
     * counts[] -> [[0] [0] [0] [0]]
     * 
     * //references to the array
     * The variable refers to the array but isn't the array
     * The variable is a reference to the array
     * 
     * The indexes are zero indices and are used to identify
     * the locations in the array. 
     * 
     */
    
    int[] counts = new int[4]; // Lets declare a variable and the array type
    
    //Lets print out the value of the 0th elements of the array
    System.out.println("The zeroth element is " + counts[0]);
    
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3]-= 60;
    
    //The result of this is that counts = [7, 14, 1, -60]
    
    //Running through an array with a loop
    
    int i = 0;
    while (i < 4) {
        System.out.println(counts[i]);
        i++;
    
    }
    
    //ArrayIndexOutOfBoundsException happens if you go beyond
    //the allowable indices of an array
    System.out.println(counts[4]);
    
    //The same happens if you try to do this
    System.out.println(counts[-1]);
    
  }
  
  
    
}
