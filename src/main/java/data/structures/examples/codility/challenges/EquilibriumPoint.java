package data.structures.examples.codility.challenges;

/**
 * @author ilariacorda on 19/07/2017.
 * @project Java-Code-Experiments
 * Work out the equilibrium point of an array
 */
public class EquilibriumPoint {

    public static void main(String args[]) {
        int[] myArray = {-7, 1, 5, 2, -4, 3, 0};
        int equilibriumPoint = equilibriumPointSolution(myArray);
        System.out.println("This is the equilibrium point for the array " + equilibriumPoint);

    }


    public static int equilibriumPointSolution(int[] A)
    {
        //We set the leftSum and rightSum to zero
        int leftSum=0;
        int rightSum = 0;
        int index;
        int value;

        for (index = 0; index < A.length; index ++)
        {
            rightSum += A[index];
        }
        value = rightSum;
        for(int i=0;i<A.length;i++)
        {
            leftSum += A[i];
            rightSum-=A[i];
            if (Math.abs(leftSum - rightSum) < value)
            {
                value = Math.abs(leftSum - rightSum);
            }

        }
        return value;
    }

}
