/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        //System.out.println(low +" "+ high);
        while (low <= high) {
            int middleposition = low + (high - low) / 2;
            //System.out.println(middleposition)
           if (isBadVersion(middleposition) == false) {
                low = middleposition + 1;
                //System.out.println( " Low is " + low);
            } else {
                high = middleposition - 1;
                //System.out.println( " high is " + high);
            }
        }
        return high+1;
    }
}